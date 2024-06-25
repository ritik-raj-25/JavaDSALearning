package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)=='(') st.push('(');
            else if(str.charAt(i)==')' && st.size()!=0) st.pop();
            else return false; 
        }
        if(st.size() == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(balancedBrackets(str));
        scan.close();
    }
}