package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n-1; ++i){
            for(int j = 1; j+i<=n; ++j){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
