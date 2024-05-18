package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibo(int n){
        if(n==0 || n==1) return n; //base case
        return fibo(n-1)+fibo(n-2); //recursive case
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(fibo(n));
        scan.close();
    }
}