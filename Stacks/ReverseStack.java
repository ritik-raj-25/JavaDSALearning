//T.C.: O(n)
//S.C.: O(n)

package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  //Original stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);

        Stack<Integer> gt = new Stack<>(); //Helper stack/temp stack
        while(st.size() > 0){
            gt.push(st.pop());
        }

        Stack<Integer> copy = new Stack<>(); //Copied stack
        while(gt.size() > 0){
            copy.push(gt.pop());
        }
        
        while(copy.size() > 0){ //Moving the content of copy stack(copy) to original stack(st)
            st.push(copy.pop());
        }
        System.out.println("Stack in reversed order:"+st);
    }
}
