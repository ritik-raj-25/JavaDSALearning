package Loops;

import java.util.Scanner;

public class OddNumberFromOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = scan.nextInt();
        for(int i = 1; i<=n; ++i){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
        scan.close();
    }
}
