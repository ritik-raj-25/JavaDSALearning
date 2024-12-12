//If you have to perform different tasks at the occurrence of different exceptions, 
//use java multi-catch block.

//1. At a time only one exception occurs and at a time only one catch block is executed.
//2. All catch blocks must be ordered from most specific to most general, 
//   i.e. catch for ArithmeticException must come before catch for Exception.
//   Otherwise, we will get compile time error

package ExceptionHandling;

public class MutlipleCatchBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 7;
        int b = 0;
        try {
            int res = a/b;
            arr[6] = res;
        }catch(ArithmeticException e){ //for handling ArithmeticException
            System.out.println("ArithmeticException: "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){ //for handling ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundException: "+e.getMessage());
        }catch(Exception e){ //for handling any other type of Exception
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("End of the program...");
    }
}
