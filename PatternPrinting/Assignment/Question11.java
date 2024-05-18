package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=2*n-1; ++i){
            int a = i;
            if(a>n) a = 2*n-i;
            for(int j = 1; j<=a; ++j){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
