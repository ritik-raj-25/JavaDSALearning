package Stacks;

import java.util.Stack;

public class PushAtBottomRecursively {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int temp = st.pop();
        pushAtBottom(st,x);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack:"+st);

        pushAtBottom(st,0); // 0 is to be pushed at the bottom of the stack

        System.out.println("Updated Stack:"+st);   
    }
}
