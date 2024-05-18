package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print(" " + " ");
            }
            int a = i+1;
            for(int j = 1; j<=i; ++j){
                --a;
                System.out.print((char)(a+64) + " ");
            }
            for(int j=1; j<=i-1; ++j){
                ++a;
                System.out.print((char)(a+64) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
