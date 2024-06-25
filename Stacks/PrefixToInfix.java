package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "-+-9+*53/8234";
        Stack<StringBuilder> val = new Stack<>();
        for(int i=prefix.length()-1; i>=0; --i){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(new StringBuilder(""+ch));
            }
            else{
                StringBuilder val1 = val.pop();
                StringBuilder val2 = val.pop();
                StringBuilder temp = new StringBuilder(""+'(');
                val.push(temp.append(val1).append(ch).append(val2).append(')'));
            }
        }
        StringBuilder infix = val.pop();
        System.out.println(infix);
    }
}
