package MultiThreading;

class Count{
    private static int cnt;
    //synchronized (keyword) is used to make incr() "thread safe", i.e., only one thread can work with incr() at a time.
    public static synchronized void incr(){ 
        ++cnt;
    }
    public static int getCount(){
        return cnt;
    }
}

class AAA implements Runnable{
    public void run(){
        for(int i=0; i<10000; ++i){
            Count.incr();
        }
    }
}

class BBB implements Runnable{
    public void run(){
        for(int i=0; i<10000; ++i){
            Count.incr();
        }
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        AAA obj1 = new AAA();
        BBB obj2 = new BBB();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
            t1.join(); //Waits for this thread to die.
            t2.join(); //Waits for this thread to die.
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println(Count.getCount());
    }
}
