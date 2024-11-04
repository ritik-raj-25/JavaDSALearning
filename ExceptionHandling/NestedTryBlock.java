//In Java, using a try block inside another try block is permitted. 
//It is called as nested try block.

//1. When any try block does not have a catch block for a particular exception, 
//   then the catch block of the outer (parent) try block are checked for that exception, 
//   and if it matches, the catch block of outer try block is executed.

//2. If none of the catch block specified in the code is able to handle the exception, 
//   then the Java runtime system will handle the exception.

package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 7;
        int b = 1;
        try {
            int res = a/b; //this statement may throw an ArithmeticException object
            try{ //nesting of try block
                arr[5] = res;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundException: "+e.getMessage());
            }
            System.out.println("End of outer try block...");
        }catch(ArithmeticException e){ //to handle ArithmeticException
            System.out.println("ArithmeticException: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
        System.out.println("End of the program...");
    }
}