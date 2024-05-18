package PatternPrinting.Composite;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n =  scan.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j<=nsp; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j<=nst; ++j){
                System.out.print("* ");
            }
            System.out.println();
            nst += 2;
            nsp -= 1;
        }
        nst = 2*(n-1) - 1;  // nst = nst - 4;
        nsp = 1;
        for(int i = 1; i < n; ++i){
            for(int j = 1; j<=nsp; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j<=nst; ++j){
                System.out.print("* ");
            }
            System.out.println();
            nst -= 2;
            nsp += 1;
        }
        scan.close();
    }    
}
