package StringBuilders.Assignment;

import java.util.Scanner;

public class ReverseAndConcatenate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        StringBuilder s = new StringBuilder(sb);
        s.reverse();
        sb.append(s);
        System.out.println(sb);
        scan.close();
    }
}
