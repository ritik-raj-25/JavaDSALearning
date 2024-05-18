package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter d:");
        int d = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            System.out.println(a);
            a+=d;
        }
        scan.close();
    }
}
