package StringBuilders.Assignment;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        int num = 0;
        int a = (int)Math.pow(10, n-1);
        for(int i=0; i<n; ++i){
            num += (sb.charAt(i)-'0')*a;
            a /= 10;
        }
        System.out.println("Interal form:"+num);
        scan.close();
    }
}
