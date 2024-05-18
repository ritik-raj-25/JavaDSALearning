package Recursion.Assignment;

import java.util.Scanner;

public class ReverseNumber {
    static int rev = 0;
    public static int reverse(int n){
        if(n==0) return rev;
        int rem = n%10;
        rev = rev*10+rem;
        reverse(n/10);
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(reverse(n));
        scan.close();
    }
}