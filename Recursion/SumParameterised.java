package Recursion;

import java.util.Scanner;

public class SumParameterised {
    public static void sum(int sum,int n){
        if(n==0){ //base case
            System.out.println(sum);
            return;
        }
        sum(sum+n,n-1); //recursive case
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        sum(0, n);
        scan.close();
    }
}