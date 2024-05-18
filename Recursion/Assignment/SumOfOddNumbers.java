package Recursion.Assignment;

import java.util.Scanner;

public class SumOfOddNumbers{
    public static int sumOdd(int a, int b){
        if(a>b) return 0;  //base case
        if(a==b) return a; //base case
        return a + sumOdd(a+2, b-2) + b; //recurrence relation
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        if(a%2==0) a += 1;
        if(b%2==0) b -= 1;
        System.out.println(sumOdd(a,b));
        scan.close();
    }
}