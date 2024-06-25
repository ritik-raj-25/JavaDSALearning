package Stacks;

import java.util.Stack;

public class RemoveElementFromGivenIndx {
    public static void removeFromIndx(Stack<Integer> st, int indx){
        if(st.size() == indx+1){
            st.pop();
            return;
        }
        int x = st.pop();
        removeFromIndx(st, indx);
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

        removeFromIndx(st,2); // Element is to be removed from indx 2

        System.out.println("Updated Stack:"+st); 
    }
}
