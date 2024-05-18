package Recursion;

import java.util.Scanner;

public class PreInPost {
    public static void zigZag(int n){
        if(n==0) return; //base case
        System.out.print(n+" "); //pre
        zigZag(n-1);
        System.out.print(n+" "); //in
        zigZag(n-1);
        System.out.print(n+" "); //post
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        zigZag(n);
        scan.close();
    }
}
