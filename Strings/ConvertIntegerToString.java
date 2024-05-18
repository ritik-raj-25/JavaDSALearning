package Strings;

import java.util.Scanner;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        String s = "" + n;
        System.out.println(s); 
        scan.close();
    }
}
