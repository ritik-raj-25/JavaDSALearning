package BitManupulation;

import java.util.Scanner;

public class ToggleKthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter k: ");
        int k = scan.nextInt();

        //bit masking
        int mask = (1<<k);

        //Verification(Before)
        if((n&mask) == 0) System.out.println("Before: "+false);
        else System.out.println("Before: "+true);

        //Toggling kth bit
        n ^= mask;

        //Verification
        if((n&mask) == 0) System.out.println("After: "+false);
        else System.out.println("After: "+true);
        scan.close();
    }
}
