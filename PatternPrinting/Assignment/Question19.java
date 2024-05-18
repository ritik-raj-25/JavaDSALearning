package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n =  scan.nextInt();
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j<=2*i-1; ++j){
                if(j==1 || j==2*i-1) System.out.print(i + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        scan.close();
    }
}
