//1. An exception is first thrown from the top of the stack and if it is not 
//   caught, it drops down the call stack to the previous method. 
//   If not caught there, the exception again drops down to the previous 
//   method, and so on until they are caught or until they reach 
//   the very bottom of the call stack. This is called exception propagation.

//2. By default Unchecked Exceptions are forwarded in calling chain (propagated).

//3. By default, Checked Exceptions are not forwarded in calling chain (propagated).


package ExceptionHandling;

public class ExceptionPropagation {
    public static void m(){
        int res = 7/0; //this will cause ArithmeticException
        System.out.println(res);
    }
    public static void n(){
        m();
    }
    public static void p(){
        try{
            n();
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e);
        }
    }
    public static void main(String[] args) {
        p();
        System.out.println("End of the program...");
    }
}
