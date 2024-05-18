package Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static int pow(int a, int b){
        if(b==0) return 1; //base case
        int ans = pow(a, b/2); //recursive case
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
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