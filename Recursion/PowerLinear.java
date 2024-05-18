package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static int pow(int a, int b){
        if(b==0) return 1; //base case
        return a*pow(a, b-1); //recursive case
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a and b:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(pow(a,b));
        scan.close();
    }
}