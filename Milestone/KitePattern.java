package Milestone;

import java.util.Scanner;

public class KitePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i=1; i<2*n; ++i){
            int k = i;
            if(i>n) k = 2*n-i;
            for(int j=1; j<2*n; ++j){
                if(j==n-k+1 || j==n+k-1 || i==n || j==n) System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
