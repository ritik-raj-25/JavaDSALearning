package StringBuilders.Assignment;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        boolean flag = true; //true means palindrome
        int i = 0;
        int j = n-1;
        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                flag = false; //false means not palindrome
            }
            ++i;
            --j;
        }
        if(flag == true) System.out.println("The given string is palindrome.");
        else System.out.println("The given string is not palindrome.");
        scan.close();
    }
}
