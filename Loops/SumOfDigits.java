package Loops;

import java.util.Scanner;

public class SumOfDigits {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digits in "+num+" is "+sum);
    }
}
