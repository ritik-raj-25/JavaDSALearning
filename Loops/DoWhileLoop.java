// Print all numbers form 1 to N

package Loops;

import java.util.Scanner;

public class DoWhileLoop {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        int i = 1;
        do {   //Exit Controlled Loop
           System.out.println(i); 
           ++i;
        } while(i<=n);
    } 
}
