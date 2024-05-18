package Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        System.out.println(num*num);
    }
}