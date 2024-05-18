package Conditions.Assignment;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = scan.nextInt();
        if(num < 0){

            System.out.println("Absolute value of "+num+" is "+(-num));
        }
        else{

            System.out.println("Absolute value of "+num+" is "+num);
        }
    }
}
