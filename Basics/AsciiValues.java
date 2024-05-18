package Basics;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = scan.next().charAt(0);    //Inputting character
        System.out.println("ASCII value of "+ch+" is "+(int)ch);
        scan.close();
    }
}
