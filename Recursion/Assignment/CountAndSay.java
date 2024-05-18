package Recursion.Assignment;

import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n){
        if(n==1) return "1";
        String s = countAndSay(n-1);
        int i=0, j=1;
        StringBuilder ans = new StringBuilder();
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                ans.append(j-i);
                ans.append(s.charAt(i));
                i=j;
            }
            ++j;
        }
        ans.append(j-i);
        ans.append(s.charAt(i));
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        System.out.println(countAndSay(n));
        scan.close();
    }
}
