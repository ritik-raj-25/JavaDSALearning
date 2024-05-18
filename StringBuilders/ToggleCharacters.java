package StringBuilders;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        for(int i=0; i<sb.length(); ++i){
            char ch = sb.charAt(i);
            if(ch>='A' && ch<='Z') {
                ch += 32;
                sb.setCharAt(i, ch);
            }
            else if(ch>='a' && ch<='z') {
                ch -= 32;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println("Updated String:"+sb);
        scan.close();
    }
}
