package PatternPrinting.Composite;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt(); 
        for(int i = 1; i < 2*n; ++i){
            System.out.print("* ");
        } 
        System.out.println();
        for(int i = 1; i<n; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*i-1; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j<=n-i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
