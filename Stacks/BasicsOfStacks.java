package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        //Declaration of stack
        Stack<Integer> st = new Stack<>(); 

        //Basic Operations on stack
        // 1. push --> insertion of an element at the top of the stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st); //printing the stack

        // 2. pop --> deletion of an element from the top of the stack
        st.pop();
        System.out.println(st);

        // 3. peek --> viewing the top-most element of the stack
        System.out.println(st.peek());
        System.out.println(st);

        //Auxilary operations on stack
        //1. size() --> It will return the size of the stack
        System.out.println("Size of the stack is "+st.size());

        // 2. isEmpty() --> It will check whether the stack is empty or not
        System.out.println(st.isEmpty());
    }
}
