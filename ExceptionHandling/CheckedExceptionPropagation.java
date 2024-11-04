//1. The Java throws keyword is used to declare an exception. 
//   It gives an information to the programmer that there may occur an 
//   exception. So, it is better for the programmer to provide the exception 
//   handling code so that the normal flow of the program can be maintained.

//2. Exception Handling is mainly used to handle the checked exceptions. 
//   If there occurs any unchecked exception such as NullPointerException, 
//   it is programmers' fault that he is not checking the code before it being used.

//3. If we are calling a method that declares an exception, 
//   we must either caught or declare the exception.

//4. if we declare the Checked Exception, then it can be propagated (forwarded in call stack).

package ExceptionHandling;

import java.io.IOException;

public class CheckedExceptionPropagation {
    public static void m() throws IOException{
        throw new IOException("Device Error...");
    }
    public static void n() throws IOException{
        m();
        System.out.println("Inside m block...");
    }
    public static void p() {
        try{
            n();
        }catch(IOException e){
            System.out.println("IOException: "+e.getMessage());
        }
    }
    public static void main(String[] args){
        p();
        System.out.println("End of the program...");
    }
}
