package Recursion.Assignment;

import java.util.Scanner;

public class SequenceIncreasingOrder {
    public static void printSequence(int i, int n, int k, String ans){
        if(ans.length()==k || i==n+1){
            if(ans.length()==k) System.out.println(ans);
            return;
        }
        printSequence(i+1, n, k, ans+i); //include
        printSequence(i+1, n, k, ans); //exclude
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.print("Enter k:");
        int k = scan.nextInt();
        printSequence(1,n,k,"");
        scan.close();
    }
}
