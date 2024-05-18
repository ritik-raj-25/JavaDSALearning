package Basics.Assignment;

import java.util.Scanner;

public class AreaOfCircleAndSimpleInterest {
    public static void main(String[] args) {
        // Area of circle
        float radius;
        System.out.print("Enter the radius of the circle:");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextFloat();
        float area = (float)Math.PI * radius * radius;
        System.out.println("Area of circle:"+area);
        //Simple Interest
        System.out.print("Enter principal amount:");
        int p = scan.nextInt();
        System.out.print("Enter rate of Interest:");
        int rate = scan.nextInt();
        System.out.print("Enter Time(in years):");
        int t = scan.nextInt();
        float si = p * rate * t / 100.0f;
        System.out.println("Simple Interest:"+si);
    }
}
