package Conditions;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Positive Number:");
        int num = scan.nextInt();
        if(num >= 100 && num <= 999){
            System.out.println(num+" is a three digit number.");
        }
        else{
            System.out.println(num+" is not a three digit number.");
        }
    }
}
