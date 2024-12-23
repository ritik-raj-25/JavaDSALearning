package BitManupulation;

import java.util.Scanner;

// TC: O(1)
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter r (non-negative): ");
        int r = scan.nextInt();
        int res = 1<<r; // TC: O(1)
        System.out.println("2^"+r+" = "+res);
        scan.close();
    }
}
