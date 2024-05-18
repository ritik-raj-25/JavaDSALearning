package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        boolean x = false;  //here, false means prime
        for(int i = 2; i<=num/2; ++i){
            if(num%i == 0){
                System.out.println(num+" is Composite Number.");
                x = true; //here, true means Composite
                break;
            }
        }
        if(num == 1){
            System.out.println(num+ " is Neither Prime nor Composite.");
        }
        else if(x == false){
            System.out.println(num+" is prime Number.");
        }
    }
}
