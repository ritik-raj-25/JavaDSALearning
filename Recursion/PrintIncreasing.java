package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void printIncreasing(int n){
        if(n==0) return; //Base case
        printIncreasing(n-1); //Recursive case
        System.out.println(n); //work
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        printIncreasing(n);
        scan.close();
    }
}