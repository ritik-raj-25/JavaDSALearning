// Monitor Lock: Every object in Java has an associated "monitor" (lock). 
//When a thread enters a synchronized block or method on an object, 
//it "acquires" the object's monitor lock, meaning no other thread can 
//access any synchronized method on that object until the lock is released.

// wait() and notify() Requirements: 
//The wait() and notify() methods manage inter-thread communication:
//wait(): When a thread calls wait(), it temporarily releases the monitor 
//lock and goes into a waiting state. 
//It will only wake up if another thread calls notify() or notifyAll() 
//on the same object.
// notify(): When a thread calls notify(), it signals one of the waiting 
//threads (if any) to wake up and attempt to re-acquire the lock to 
//resume execution.

// Why synchronized is Needed: Java requires wait() and notify() to be 
//called only within synchronized blocks or methods. 
//This ensures that a thread holds the object's lock before it 
//waits or signals other threads. Without holding the lock, it could 
//lead to unpredictable behavior or interference between threads


package MultiThreading;

class Q{
    private int val;
    private boolean flagStatus = true;
    public synchronized void put(int val){
        try{
            while(!flagStatus){
                wait();
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Put: "+val);
        this.val = val;
        flagStatus = false;
        notify();
    }
    public synchronized void get(){
        while (flagStatus) {
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Got: "+val);
        flagStatus = true;
        notify();
    }
}

class Producer implements Runnable {
    private Q q;
    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Consumer implements Runnable {
    private Q q;
    public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    public void run(){
        while(true){
            q.get();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
