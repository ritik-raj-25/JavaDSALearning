package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==1 || n==0) return 1; //base case
        return n*fact(n-1); //recursive case / recurrence relation
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(fact(n));
        scan.close();
    }
}