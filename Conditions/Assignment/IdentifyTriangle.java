package Conditions.Assignment;

import java.util.Scanner;

public class IdentifyTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st side:");
        int s1 = scan.nextInt();
        System.out.print("Enter 2nd side:");
        int s2 = scan.nextInt();
        System.out.print("Enter 3rd side:");
        int s3 = scan.nextInt();
        if((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2){
            if((s1 == s2) && (s2 == s3)){
                System.out.println("Equilateral Triangle");
            }
            else if((s1 == s2) || (s2 == s3) || (s1 == s3)){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Triangle not possible.");
        }
    }
}
