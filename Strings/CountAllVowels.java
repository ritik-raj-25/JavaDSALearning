package Strings;

import java.util.Scanner;

public class CountAllVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        int cnt = 0;
        for(int i=0; i<s.length(); ++i){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                ++cnt;
            }
        }
        System.out.println("Number of vowels in the given string is: "+cnt);
        scan.close();
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
