package Stacks;

import java.util.Stack;

public class InfixEvaluation {
    public static int calculation(int val1, char operator, int val2){
        if(operator == '+') return (val1 + val2);
        if(operator == '-') return (val1 - val2);
        if(operator == '*') return (val1 * val2);
        else return (val1 / val2); //(operator == '/')
    }
    public static boolean checkPriority(char operator,char ch){
        if((operator=='+' || operator=='-') && (ch=='+' || ch=='-')) return true;
        if((operator=='+' || operator=='-') && (ch=='*' || ch=='/')) return false;
        else return true; // (operator=='*' || operator=='/')   
    }
    public static boolean isDigit(char ch){
        if(ch>='0' && ch<='9') return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "9-(5*3+8/2)+3-4";  //-11
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<s.length(); ++i){
            char ch = s.charAt(i);
            if(isDigit(ch)){
                val.push(ch-'0');
            }
            else if(op.size()==0 || ch == '(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch == ')'){
                char operator = op.pop();
                while(operator!='('){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    val.push(calculation(val1, operator, val2));
                    operator = op.pop();
                }
            }
            else{
                char operator = op.peek();
                while(op.size()>0 && operator!='(' && checkPriority(operator,ch)){ //Priority of operator >= ch 
                    int val2 = val.pop();
                    int val1 = val.pop();
                    val.push(calculation(val1, operator, val2));
                    op.pop();
                    if(op.size()>0) operator = op.peek();
                }
                op.push(ch);
            }
        }
        while(val.size() > 1){
            char operator = op.pop();
            int val2 = val.pop();
            int val1 = val.pop();
            val.push(calculation(val1, operator, val2));
        }
        int ans = val.pop();
        System.out.println(ans);
    }
}