//1. The Java throw keyword is used to throw an exception explicitly.

//2. We specify the exception object which is to be thrown. 
//   The Exception has some message with it that provides the exception description. 
//   These exceptions may be related to user inputs, server, etc.

//3. We can throw either checked or unchecked exceptions in Java by throw keyword. 

//4. It is mainly used to throw a custom exception. 

//5. If we throw a checked exception using throw keyword, it is must to 
//   handle the exception using catch block or the method must declare it 
//   using throws declaration.


package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void validate(int age){
        if(age < 18) {
            //throwing custom exception explicitly
            throw new ArithmeticException("Person is not eligible to vote...");
        }
        else{
            System.out.println("Person is eligible to vote...");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        try{
            validate(age);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }
        System.out.println("End of the program...");
        scan.close();
    }
}
