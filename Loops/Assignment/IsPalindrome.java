package Loops.Assignment;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = scan.next();
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                break;
            }
            ++i;
            --j;
        }
        if(i > j){
            System.out.println(str+" is Palindrome.");
        }
        else{
            System.out.println(str+" is not Palindrome.");
        }
        scan.close();
    }
}
