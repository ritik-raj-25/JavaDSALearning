package PatternPrinting.Composite;

import java.util.Scanner;

public class NumberTriangleFlipped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();  
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; ++j){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
