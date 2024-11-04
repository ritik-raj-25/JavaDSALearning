//Bank has one cash counter and it services two queues (Que-A and Que-В). 
//Gives service for two persons in Que-A followed by one person in Que-B 
//and repeats it until clear all customers. 
//Write a Java program to implement this via synchronized thread with 
//inter communications.

package MultiThreading;

class CashCounter {
    private boolean flagStatus = true;
    private int count = 2;
    public synchronized void queA(){
        while(!flagStatus){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Que-A");
        --count;
        if(count==0) {
            flagStatus = false;
            count = 2;
        }
        notifyAll();
    }
    public synchronized void queB(){
        while(flagStatus){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Que-B");
        flagStatus = true;
        notifyAll();
    }
}

class QueA implements Runnable {
    private CashCounter cc;
    public QueA(CashCounter cc){
        this.cc = cc;
        Thread t = new Thread(this,"Que-A");
        t.start();
    }
    public void run(){
        while(true){
            cc.queA();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
} 

class QueB implements Runnable {
    private CashCounter cc;
    public QueB(CashCounter cc){
        this.cc = cc;
        Thread t = new Thread(this,"Que-B");
        t.start();
    }
    public void run(){
        while(true){
            cc.queB();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        CashCounter cc = new CashCounter();
        new QueA(cc);
        new QueB(cc);
    }
}