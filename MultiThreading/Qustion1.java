//Create a user defined class which inherits thread class to do the given tasks 
//a. It stores two integer numbers like starting and ending number. 
//b. Create a constructor to initialize those numbers through the parameter 
//c. To override the run method so that it finds the count of numbers which are divisible by 3, 5, both 3 and 5 between the starting and ending number. Display the count. 
//Write a Demonstrate class where 3 objects of the above user defined class to be created with different numbers set. Then invoke the run method such that the job of object1 should be completed before the next object.


package MultiThreading;

class T extends Thread{
    private int start;
    private int end;
    
    public T(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    public void run(){
        int divBy3 = 0;
        int divBy5 = 0;
        int divByBoth3And5 = 0;
        for(int i=start; i<=end; ++i){
            if(i%3==0 && i%5==0){
                ++divByBoth3And5;
            }
            else if(i%3==0){
                ++divBy3;
            }
            else if(i%5==0){
                ++divBy5;
            }
        }
        System.out.println(divBy3);
        System.out.println(divBy5);
        System.out.println(divByBoth3And5);
        System.out.println();
    }
}

public class Qustion1 {
    public static void main(String[] args) {
		T obj1 = new T(1,10);
		T obj2 = new T(11,20);
		T obj3 = new T(21,30);
		
		obj1.start();
		try{obj1.join();}catch(InterruptedException e){System.out.println(e);}
		
		obj2.start();
		try{obj2.join();}catch(InterruptedException e){System.out.println(e);}
		
		obj3.start();
		try{obj3.join();}catch(InterruptedException e){System.out.println(e);}
	}
}
