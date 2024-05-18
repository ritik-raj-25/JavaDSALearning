package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();  
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=n; ++j){
                if (j > n-i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
