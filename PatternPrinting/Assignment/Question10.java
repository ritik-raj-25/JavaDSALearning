package PatternPrinting.Assignment;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print(i+1-j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
