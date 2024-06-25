package Stacks;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int temp = st.pop();
        pushAtBottom(st,x);
        st.push(temp);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int x = st.pop();
        reverseStack(st);
        pushAtBottom(st, x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack: "+st);

        reverseStack(st);

        System.out.println("Updated Stack: "+st);
    }
}
