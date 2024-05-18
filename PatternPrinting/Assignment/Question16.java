package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        int a;
        for(int i = 1; i<=2*n-1; ++i){
            a = i;
            if(i>n) a = 2*n-i;
            System.out.print(a+" ");
        }
        System.out.println();
        for(int i = 1; i<n; ++i){
            for(int j = 1; j<=n-i; ++j){
                System.out.print(j + " ");
            }
            for(int j = 1; j<=2*i-1; ++j){
                System.out.print(" " + " ");
            }
            for(int j = 1; j<=n-i; ++j){
                System.out.print(n-i-j+1 + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
