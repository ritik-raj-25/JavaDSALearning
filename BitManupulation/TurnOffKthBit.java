package BitManupulation;

import java.util.Scanner;

public class TurnOffKthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter k: ");
        int k = scan.nextInt();

        //bit masking
        int mask = (1<<k);
        mask = (~mask);

        //Turning off kth bit
        n &= mask;

        //Verification
        int newMask = (1<<k);
        if((n&newMask) == 0) System.out.println(false);
        else System.out.println(true);
        scan.close();
    }
}
