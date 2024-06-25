package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String postfix = "953*82/+-3+4-";
        Stack<StringBuilder> val = new Stack<>();
        for(int i=0; i<postfix.length(); ++i){
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(new StringBuilder(""+ch));
            }
            else{
                StringBuilder val2 = val.pop();
                StringBuilder val1 = val.pop();
                StringBuilder operator = new StringBuilder(""+ch);
                StringBuilder temp = new StringBuilder(""+'(');
                val.push(temp.append(val1.append(operator).append(val2).append(')')));
            }
        }
        StringBuilder infix = val.pop();
        System.out.println(infix);
    }
}
