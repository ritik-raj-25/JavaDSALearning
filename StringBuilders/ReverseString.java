package StringBuilders;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            ++i;
            --j;
        }
        System.out.println("Updated String:"+sb);
        scan.close();
    }
}
