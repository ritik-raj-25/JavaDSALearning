package Loops;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        int temp = num;
        int cnt = 0;
        while(temp != 0){
            temp /= 10;
            ++cnt;
        }
        System.out.println("Number of digits in "+num+" is "+cnt);
    }
}
