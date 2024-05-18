package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter r:");
        int r = scan.nextInt();
        for(int i = 1; i <= n; ++i){
            System.out.println(a);
            a*=r;
        }
    }
}
