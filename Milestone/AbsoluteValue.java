package Milestone;

import java.util.Scanner;

public class AbsoluteValue {
    public static int absolute(int val){
        if(val<0) return - val;
        else return val;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int val = scan.nextInt();
        System.out.println("Absolute Value of "+val+" is : "+absolute(val));
        scan.close();
    }
}
