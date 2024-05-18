package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=2*n-1; ++j){
                int a = j;
                if(j>n) a = 2*n-j;
                if(i == a){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" " + " ");   
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
