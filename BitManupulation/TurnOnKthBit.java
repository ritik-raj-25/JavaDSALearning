package BitManupulation;

import java.util.Scanner;

public class TurnOnKthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter k: ");
        int k = scan.nextInt();
        int mask = (1<<k);
        n |= mask;

        //Verification
        if((n&mask) == 0) System.out.println(false);
        else System.out.println(true);
        scan.close();
    }
}
