package Recursion;

import java.util.Scanner;

public class TraversingString {
    public static void printString(int i, StringBuilder sb){
        if(i==sb.length()) return;
        System.out.println(sb.charAt(i));
        printString(i+1, sb);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        printString(0,sb);
        scan.close();
    }
}
