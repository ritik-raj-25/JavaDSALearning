package MultiThreading;

class A extends Thread{ //class A is now a thread
    public void run(){ //overriding run() method of Thread class
        for(int i=0; i<100; ++i){
            System.out.println("Hi...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    } 
}

class B extends Thread{ //class B is now a thread
    public void run(){ //overriding run() method of Thread class
        for(int i=0; i<100; ++i){
            System.out.println("Hello...");
            try{
                Thread.sleep(10); //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingUsingThreadClass {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority()); //fetching the priority of the thread obj1 (the default priority for a thread is 5)
        System.out.println(obj2.getPriority()); //fetching the priority of the thread obj2

        //Thread.MAX_PRIORITY means 10, Thread.MIN_PRIORITY means 1, Thread.NORM_PRIORITY means 5
        obj2.setPriority(Thread.MAX_PRIORITY); //setting the priority of the thread obj2 (it's important to note that this is only a suggestion, and the actual behavior depends on the thread scheduler of the underlying operating system.)

        obj1.start(); // Starting a thread
        obj2.start(); // Starting a thread
    }
}
