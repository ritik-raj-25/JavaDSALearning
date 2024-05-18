package Recursion.Assignment;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(fact(n));
        scan.close();
    }
}
