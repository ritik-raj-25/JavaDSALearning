package PatternPrinting.Squares;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= n; ++j){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
