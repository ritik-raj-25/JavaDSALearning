package Conditions.Assignment;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0){  //Relational Operators --> ==, !=, <, >, <=, and >=
            System.out.println(num+" is a even number.");
        }
        else{
            System.out.println(num+" is a odd number.");
        }
    }
}