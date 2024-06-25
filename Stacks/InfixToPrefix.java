package Stacks;

import java.util.Stack;

public class InfixToPrefix {
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
        String infix = "9-(5*3+8/2)+3-4"; 
        Stack<StringBuilder> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<infix.length(); ++i){
            char ch = infix.charAt(i);
            if(isDigit(ch)){
                val.push(new StringBuilder(""+ch));
            }
            else if(op.size()==0 || ch == '(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch == ')'){
                char operator = op.pop();
                while(operator!='('){
                    StringBuilder val2 = val.pop();
                    StringBuilder val1 = val.pop();
                    StringBuilder temp = new StringBuilder(""+operator);
                    val.push(new StringBuilder(temp.append(val1.append(val2))));
                    operator = op.pop();
                }
            }
            else{
                char operator = op.peek();
                while(op.size()>0 && operator!='(' && checkPriority(operator,ch)){ //Priority of operator >= ch 
                    StringBuilder val2 = val.pop();
                    StringBuilder val1 = val.pop();
                    StringBuilder temp = new StringBuilder(""+operator);
                    val.push(new StringBuilder(temp.append(val1.append(val2))));
                    operator = op.pop();
                    if(op.size()>0) operator = op.peek();
                }
                op.push(ch);
            }
        }
        while(val.size() > 1){
            char operator = op.pop();
            StringBuilder val2 = val.pop();
            StringBuilder val1 = val.pop();
            StringBuilder temp = new StringBuilder(""+operator);
            val.push(new StringBuilder(temp.append(val1.append(val2))));
        }
        StringBuilder prefix = val.pop();
        System.out.println(prefix);
    }
}
