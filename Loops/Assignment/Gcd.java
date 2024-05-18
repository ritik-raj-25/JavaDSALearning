package Loops.Assignment;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd Number:");
        int num2 = scan.nextInt();
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCF = "+num1);
        scan.close();
    }
}
