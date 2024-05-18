package StringBuilders.Assignment;

import java.util.Scanner;

public class SubstringWithVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.next());
        int n = sb.length();
        int cntV = 0;
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<=n; ++j){
                if(isOnlyVowels(sb.substring(i,j))){
                    ++cntV;
                }
            }
        }
        System.out.println(cntV);
        scan.close();
    }
    public static boolean isOnlyVowels(String str){
        for(int i=0; i<str.length(); ++i){
            if(!isVowel(str.charAt(i))){
                return false;
            }
        }
        return true;
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