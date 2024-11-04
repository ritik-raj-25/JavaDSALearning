//1. Java finally block is a block used to execute important code such as closing the connection, etc.

//2. Java finally block is always executed whether an exception is handled or not. 
//   Therefore, it contains all the necessary statements that need to be executed
//   regardless of the exception occurs or not.

//3. For each try block there can be zero or more catch blocks, but only one finally block.

//4. The finally block will not be executed if the program exits 
//   (either by calling System.exit() or by causing a fatal error 
//   that causes the process to abort).

package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 5;
        int b = 1;
        try{
            int res = a/b;
            //System.exit(0);
            arr[6] = res;
            System.out.println("Inside try block...");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }finally{
            System.out.println("Inside finally block...");
        }
        System.out.println("End of the program...");
    }
}
