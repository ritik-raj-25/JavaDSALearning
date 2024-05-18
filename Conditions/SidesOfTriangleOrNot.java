package Conditions;

import java.util.Scanner;

public class SidesOfTriangleOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Three sides:");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        if((s1+s2) > s3 && (s1+s3) > s2 && (s2+s3) > s1){
            System.out.println(s1+","+s2+", and "+s3+" are the sides of Triangle.");
        } 
        else{
            System.out.println(s1+","+s2+", and "+s3+" are not the sides of Triangle.");
        }
    }
}
