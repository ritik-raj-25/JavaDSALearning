package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=2*n-1; ++i){
            for(int j = 1; j<=2*n-1; ++j){
                int a = i;
                if(i>n) a = 2*n-i;
                if(j <= n-a+1 || j >= n+a-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        scan.close();
    }
}
