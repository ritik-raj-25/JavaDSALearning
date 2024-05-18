package Loops.Assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        for(int i = n; i<=n*10; i+=n){
            System.out.println(i);
        }
        scan.close();
    }
}
