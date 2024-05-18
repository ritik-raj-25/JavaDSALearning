package PatternPrinting.Squares;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows and columns:");
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= m; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}