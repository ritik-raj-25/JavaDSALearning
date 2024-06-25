package Stacks;

import java.util.Stack;

public class DisplayStackRecursively {
    //T.C.: O(n)
    //S.C.: O(n)
    public static void printReverse(Stack<Integer> st){ //method to print stack in reverse order
        if(st.empty()){  //base case
            return;
        }
        int x = st.pop();
        System.out.print(x+" ");
        printReverse(st); //recursive case --> magic
        st.push(x);
    }
    
    //T.C.: O(n)
    //S.C.: O(n)
    public static void printStack(Stack<Integer> st){ //method to print the stack
        if(st.empty()){  //base case
            return;
        }
        int x = st.pop();
        printStack(st); //recursive case --> magic
        System.out.print(x+" ");
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.print("Stack is: ");
        printStack(st);
        System.out.println();

        System.out.print("Stack in reverse order: ");
        printReverse(st);
        System.out.println();
    }
}
