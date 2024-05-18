package Recursion;

import java.util.Scanner;

public class PrintIncreasingExtraParameter {
    public static void printIncreasing(int n,int i){
        if(i>n) return; //Base case
        System.out.println(i); //work
        printIncreasing(n,i+1); //Recursive case    
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        printIncreasing(n,1);
        scan.close();
    }
}