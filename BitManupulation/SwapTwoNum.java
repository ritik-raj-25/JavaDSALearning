package BitManupulation;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();
        System.out.println("After Swapping: "+num1+" "+num2);

        //swaping
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("After Swapping: "+num1+" "+num2);
        scan.close();
    }
}
