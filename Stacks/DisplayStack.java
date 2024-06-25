//T.C.: O(n)
//S.C.: O(n)

package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void printStack(Stack<Integer> st){ //method to print the stack
        Stack<Integer> helper = new Stack<>();
        while(st.size() > 0){
            helper.push(st.pop());
        }

        System.out.print("Stack is: ");
        while(helper.size()>0){
            int x = helper.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        printStack(st);
        System.out.println("Stack is: "+st);
    }
}
