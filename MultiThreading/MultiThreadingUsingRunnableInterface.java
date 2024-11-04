package MultiThreading;

class AA implements Runnable{
    public void run(){
        for(int i=0; i<5; ++i){
            System.out.println("Hi...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class BB implements Runnable{
    public void run(){
        for(int i=0; i<5; ++i){
            System.out.println("Hello...");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        AA obj1 = new AA();
        BB obj2 = new BB();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
