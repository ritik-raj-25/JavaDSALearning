package Recursion.Assignment;

import java.util.Scanner;

public class StairPath{
    public static int ways(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        return ways(n-1)+ways(n-2)+ways(n-3);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(ways(n));
        scan.close();
    }
}