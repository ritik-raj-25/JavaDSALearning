package PatternPrinting.Squares;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i <= n; ++i){
            for(char j = 1; j <= n; ++j){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
