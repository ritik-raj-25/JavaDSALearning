package Recursion.Assignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int n, StringBuilder ans){ //Method 1
        if(n==0){
            ans.reverse();
            System.out.println(ans);
            return;
        }
        ans.append(n%2);
        decimalToBinary(n/2,ans);
    }
    public static String decimalToBinary2(int n){ //Method 2
        if(n==0) return "";
        return decimalToBinary2(n/2) + n%2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        StringBuilder ans = new StringBuilder("");
        decimalToBinary(n,ans);
        System.out.println(decimalToBinary2(n));
        scan.close();
    }
}