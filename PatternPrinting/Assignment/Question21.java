package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question21 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();  
        for(int i = 1; i<=n-1; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*n-2*i-1; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        } 
        for(int i = 1; i<=2; ++i){
            for(int j = 1; j<=2*n-1; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n-1; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*i-1; ++j){
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
