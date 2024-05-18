package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class BinaryTriangleMethod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();  
        for(int i = 1; i<=n; ++i){
            for(int j = 1; j<=i; ++j){
                if((i+j)%2 == 0){    //Observation --> We have to print '1' when i & j both are either even or odd. And odd + odd = even. Also, even + even = even. 
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
