package Conditions.Assignment;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        int cp = scan.nextInt();
        System.out.print("Enter Selling Price:");
        int sp = scan.nextInt();
        if(sp > cp){
            System.out.println("Profit: "+(sp - cp));
        }
        else if(cp > sp){
            System.out.println("Loss: "+(cp - sp));
        }
        else{
            System.out.println("No Profit No Loss");
        }
    }
}
