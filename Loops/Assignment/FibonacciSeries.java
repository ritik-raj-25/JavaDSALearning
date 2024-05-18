package Loops.Assignment;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1+" ");
        int i = 1;
        while(i < n){
            System.out.print(a2+" ");
            int temp = a2; 
            a2 = a1 + a2;
            a1 = temp;
            ++i;
        }
        scan.close();
    }
}
