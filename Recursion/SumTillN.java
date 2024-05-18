package Recursion;

import java.util.Scanner;

public class SumTillN {
    public static int sum(int n){
        if(n==1 || n==0) return n; //base case
        return n+sum(n-1); //recursive case and work
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(sum(n));
        scan.close();
    }
}
