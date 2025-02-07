package Conditions;

import java.util.Scanner;

public class EnhancedSwitchStatementType3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = scan.nextInt();
        System.out.print("Enter num2:");
        int num2 = scan.nextInt();
        System.out.println("Menu:");
        System.out.println("Add  Hit-1");
        System.out.println("Sub  Hit-2");
        System.out.println("Mul  Hit-3");
        System.out.println("Div  Hit-4");
        int operation = scan.nextInt();
        scan.close();
        int res = switch(operation) {
            case 1:
                System.out.println("Processing Summation...");
                yield num1+num2;
            case 2:
                System.out.println("Processing Substration...");
                yield num1-num2;
            case 3:
                System.out.println("Processing Multiplication...");
                yield num1*num2;
            case 4:
                System.out.println("Processing Division...");
                yield num1/num2;
            default: //Enhanced switch statement should hava a default case
                System.out.println("Invalid Operation...");
                yield -1;
        };
        System.out.println("Result: "+res);
    }
}
