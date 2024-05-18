package StringBuilders.Assignment;

import java.util.Scanner;

public class UpdateString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        for(int i=0; i<n; ++i){
            if(i%2 == 1) sb.setCharAt(i, '#');
        }
        System.out.println("Updated String:"+sb);
        scan.close();
    }
}
