package Loops;

import java.util.Scanner;

public class EvenNumberFromOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        for(int i = 2; i <= n; i = i + 2){
            System.out.print(i+" ");
        }
    }
}
