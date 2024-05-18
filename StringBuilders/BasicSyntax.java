package StringBuilders;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        // Decelaration
        StringBuilder sb = new StringBuilder(10); // By default capacity would be 16
        System.out.println(sb.capacity());

        // Initialization
        StringBuilder a = new StringBuilder("Coding Sena");
        System.out.println(a.capacity());  // Current capacity of the string builder is 16(default capacity) + 11(length of Coding Sena)

        // User Input
        Scanner scan = new Scanner(System.in);
        StringBuilder b = new StringBuilder(scan.nextLine()); 
        scan.close();

        // Printing output
        System.out.println(sb+" "+a+" "+b);
    }   
}