package BitManupulation;

import java.util.Scanner;

public class TrunOffRightMostBitMethodTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        
        //Turning off kth bit
        n &= (n-1);

        System.out.println("Result: "+n);
        scan.close();
    }
}
