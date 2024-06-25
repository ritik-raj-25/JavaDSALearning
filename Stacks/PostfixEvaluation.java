package Stacks;

import java.util.Stack;

public class PostfixEvaluation {
    public static int calculation(int val1, char operator, int val2){
        if(operator == '+') return (val1 + val2);
        if(operator == '-') return (val1 - val2);
        if(operator == '*') return (val1 * val2);
        else return (val1 / val2); //(operator == '/')
    }
    public static void main(String[] args) {
        String postfix = "953*82/+-3+4-";
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<postfix.length(); ++i){
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else{
                int val2 = val.pop();
                int val1 = val.pop();
                val.push(calculation(val1, ch, val2));
            }
        }
        int ans = val.pop();
        System.out.println(ans);
    }
}
