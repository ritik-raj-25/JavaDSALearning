package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{ //user defined exception
    public InvalidAgeException(String str){
        super(str);
    }
}

public class UserDefinedException {
    private static void validate(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("You are not eligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) throws InvalidAgeException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        try{
            validate(age);
        }catch(InvalidAgeException e){
            System.out.println("InvalidAgeException: "+e.getMessage());
        }
        System.out.println("Next Person...");
        scan.close();
    }
}