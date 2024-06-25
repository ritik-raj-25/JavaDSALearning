package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
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
                val.push(operator.append(val1.append(val2)));
            }
        }
        StringBuilder prefix = val.pop();
        System.out.println(prefix);
    }
}
