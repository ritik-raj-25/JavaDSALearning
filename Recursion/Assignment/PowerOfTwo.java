package Recursion.Assignment;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n!=1 && n%2!=0) return false;
        if(n==1) return true;
        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(isPowerOfTwo(n));
        scan.close();
    }
}
