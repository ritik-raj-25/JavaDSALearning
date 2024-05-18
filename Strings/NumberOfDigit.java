package Strings;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        String s = "" + n; // We can also use buildin method 'Integer.toString(n)' to convert integer n to string.
        System.out.println("Number of digits = "+s.length());
        scan.close();
    }
}
