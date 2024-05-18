package StringBuilders.Assignment;

import java.util.Scanner;

public class SubstringWithVowelsOptimised {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuilder sb = new StringBuilder(scan.next());
        int n = sb.length();
        int cntV = 0;
        int cnt = 0;
        for(int i=0; i<n; ++i){
            char ch = sb.charAt(i);
            if(isVowel(ch)){
                ++cnt;
            }
            else{
                cntV += cnt*(cnt+1)/2;
                cnt = 0;
            }
        }
        cntV += cnt*(cnt+1)/2;
        System.out.println(cntV);
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
