// Print all numbers form 1 to N

package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        int i = 1;
        while (i <= n) {   //Entry Controlled Loop
           System.out.println(i); 
           ++i;
        }
    }
}
