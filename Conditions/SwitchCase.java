//Calculator

package Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = scan.nextInt();
        System.out.print("Enter Operator:");
        char op = scan.next().charAt(0);
        System.out.print("Enter 2nd number:");
        int num2 = scan.nextInt();
        switch(op){
            case '+':
                System.out.println(num1+" + "+num2+" = "+(num1 + num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = "+(num1 - num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = "+(num1 * num2));
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = "+(num1 / num2));
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}

//    Syatax:
//    switch( integer expression ){
//     case constant_1:
//         do_this;
//     case constant_2:
//         do_this;
//     case constant_3:
//         do_this;
//     .
//     .
//     . 
//     case constant_n:
//     default:         //Optional
//         do_this;
//    }
