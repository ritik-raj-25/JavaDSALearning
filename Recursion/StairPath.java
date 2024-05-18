package Recursion;

import java.util.Scanner;

public class StairPath {
    public static int ways(int n){
        if(n==1 || n==2) return n;
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println( ways(n));
        scan.close();
    }
}