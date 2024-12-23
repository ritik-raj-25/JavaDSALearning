package BitManupulation;

import java.util.Scanner;

public class TurnOffRightMostBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        
        //finding k
        int k = 0;
        int helper = n;
        while((helper&1) != 1) {
            ++k;
            helper >>= 1;
        }

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
