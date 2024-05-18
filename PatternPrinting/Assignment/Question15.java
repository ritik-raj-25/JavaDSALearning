package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=2*n-1; ++i){
            System.out.print((char)(i+64)+ " ");
        }
        System.out.println();
        for(int i = 1; i<n; ++i){
            int a = 1;
            for(int j = 1; j<=n-i; ++j){
                System.out.print((char)(a+64) + " ");
                ++a;
            }
            for(int j = 1; j<=2*i-1; ++j){
                System.out.print(" " + " ");
                ++a;
            }
            for(int j = 1; j<=n-i; ++j){
                System.out.print((char)(a+64) + " ");
                ++a;
            }
            System.out.println();
        }
        scan.close();
    }
}
