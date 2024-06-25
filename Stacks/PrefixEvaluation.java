package Stacks;

import java.util.Stack;

public class PrefixEvaluation {
    public static int calculation(int val1, char operator, int val2){
        if(operator == '+') return (val1 + val2);
        if(operator == '-') return (val1 - val2);
        if(operator == '*') return (val1 * val2);
        else return (val1 / val2); //(operator == '/')
    }
    public static void main(String[] args) {
        String prefix = "-+-9+*53/8234";
        Stack<Integer> val = new Stack<>();
        for(int i=prefix.length()-1; i>=0; --i){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else{
                int val1 = val.pop();
                int val2 = val.pop();
                val.push(calculation(val1, ch, val2));
            }
        }
        int ans = val.pop();
        System.out.println(ans);
    }
}
