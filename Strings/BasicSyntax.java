//String --> Character array

package Strings;

import java.util.Scanner;

public class BasicSyntax{
    public static void main(String[] args) {
        // Declaration of string
        String s;

        // Initialization of string
        String str = "Hello";

        // Inputing a string
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        s = scan.nextLine();  // next() method will only take a single word as an input, instead 
                          // we can use nextLine() method that will take complete sentence as a input.
                          
        // Printing a string
        System.out.println(s);
        System.out.println(str);

        scan.close();
    }
}