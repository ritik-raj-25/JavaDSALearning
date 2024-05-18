package Recursion;

import java.util.Scanner;

public class GcdRecursive {
    public static int gcd(int a, int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        System.out.println("GCD = "+ gcd(a,b));
        scan.close();
    }
}
