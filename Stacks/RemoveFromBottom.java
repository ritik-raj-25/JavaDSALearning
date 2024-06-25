package Stacks;

import java.util.Stack;

public class RemoveFromBottom {
    public static void removeFromBottom(Stack<Integer> st){
        if(st.size() == 1){
            st.pop();
            return;
        }
        int x = st.pop();
        removeFromBottom(st);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack:"+st);

        removeFromBottom(st);

        System.out.println("Updated Stack:"+st); 
    }
}
