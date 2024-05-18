package Conditions;

import java.util.Scanner;

public class DivisibleByFiveOrThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive Number:");
        int num = scan.nextInt();
        if(num%5 == 0 || num%3 == 0){
            System.out.println(num+" is divisible by 5 or 3.");
        }
        else{
            System.out.println(num+" is not divisible by 5 or 3.");
        }
    }
}
