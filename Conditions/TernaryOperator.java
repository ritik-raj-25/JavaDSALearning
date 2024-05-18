package Conditions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        System.out.print((num%2==0) ? "Even" : "Odd");  //Ternary Operator
    }
}

// Syntax:
// Expression_1 (Condition) ? Expression_2 (Expression_2 to be executed if condition is true) : Expression_3 (Expression_3 to be executed if condition is false)
