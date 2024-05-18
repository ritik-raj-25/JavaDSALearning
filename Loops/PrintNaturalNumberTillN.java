//For loop

package Loops;

import java.util.Scanner;

public class PrintNaturalNumberTillN {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        // for loop
        for(int i = 0; i < n; ++i){
            System.out.print((i+1)+" ");
        }
    }
}