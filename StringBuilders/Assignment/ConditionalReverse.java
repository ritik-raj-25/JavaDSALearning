package StringBuilders.Assignment;

import java.util.Scanner;

public class ConditionalReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        reverse(sb, n/2);
        System.out.println(sb);
        scan.close();
    }
    public static void reverse(StringBuilder sb, int k){
        int n = sb.length();
        int i = k;
        int j = n-1;
        while(i<j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            ++i;
            --j;
        }
    }
}
