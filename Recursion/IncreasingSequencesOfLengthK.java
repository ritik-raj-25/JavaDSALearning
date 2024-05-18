package Recursion;

import java.util.Scanner;

public class IncreasingSequencesOfLengthK {
    public static void allSequences(int i, int n, int k, String ans){
        if(ans.length()==k || i==n+1){
            if(ans.length()==k) System.out.println(ans);
            return;
        }
        allSequences(i+1, n, k, ans+i); //include
        allSequences(i+1, n, k, ans); //exclude
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.print("Enter k:");
        int k = scan.nextInt();
        allSequences(1,n,k,"");
        scan.close();
    }
}