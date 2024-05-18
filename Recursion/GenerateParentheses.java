package Recursion;

import java.util.Scanner;

public class GenerateParentheses {
    public static void generateParentheses(int n, String ans,int ob,int cb){
        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if(ob<n) generateParentheses(n, ans+"(",ob+1,cb);
        if(cb<n && cb<ob)generateParentheses(n, ans+")",ob,cb+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        generateParentheses(n,"",0,0);
        scan.close();
    }
}