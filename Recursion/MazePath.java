package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int ways(int m, int n){
        if(m==1 || n==1) return 1; //base case
        return ways(m, n-1) + ways(m-1, n); //recursive case
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m:"); //rows
        int m = scan.nextInt();
        System.out.print("Enter n:"); //columns
        int n = scan.nextInt();
        System.out.println(ways(m,n));
        scan.close();
    }
}