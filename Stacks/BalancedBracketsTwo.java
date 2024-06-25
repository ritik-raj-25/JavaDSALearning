package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsTwo {
    public static int balancedBrackets(String str){
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)=='(') st.push('(');
            else if(str.charAt(i)==')' && st.size()!=0) st.pop();
            else ++cnt; 
        }
        cnt += st.size();
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(balancedBrackets(str));
        scan.close();
    }
}
