package Conditions.Assignment;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n1 = scan.nextInt();
        System.out.print("Enter 2nd number:");
        int n2 = scan.nextInt();
        System.out.print("Enter 3rd number:");
        int n3 = scan.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println(n1+" is Largest.");
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println(n2+" is Largest.");
        }
        else{
            System.out.println(n3+" is Largest.");
        }
    }
}
