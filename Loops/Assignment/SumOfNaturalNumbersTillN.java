package Loops.Assignment;

import java.util.Scanner;

public class SumOfNaturalNumbersTillN {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; ++i){
            sum += i;
        }
        System.out.println("Required Sum = "+sum);
        scan.close();
    }
}