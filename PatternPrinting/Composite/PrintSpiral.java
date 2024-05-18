package PatternPrinting.Composite;

import java.util.Scanner;

public class PrintSpiral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i < 2*n; ++i){
            for(int j = 1; j < 2*n; ++j){
                int a = i;
                if(a > n) a = 2*n-i;
                int b = j;
                if(j > n) b = 2*n-j;
                System.out.print(n + 1 - Math.min(a,b) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
