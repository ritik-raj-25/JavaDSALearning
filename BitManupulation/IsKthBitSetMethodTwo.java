package BitManupulation;

import java.util.Scanner;

public class IsKthBitSetMethodTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter k: ");
        int k = scan.nextInt();
        int helper = (n>>k);
        if((helper&1) == 0) System.out.println(false); //helper --> even
        else System.out.println(true);      // helper --> odd
        scan.close();
    }
}
