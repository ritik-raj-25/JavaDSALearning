//T.C.: O(n)
//S.C.: O(n)

package Stacks;

import java.util.Stack;

public class PushElementAtGivenIndx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  //Original stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);

        int indx = 2; // The index at which the element needs to be pushed

        Stack<Integer> helper = new Stack<>(); // temp stack / helper stack
        while(st.size() > indx){
            helper.push(st.pop());
        }

        st.push(0); //pushing the element at the given indx (0 based indexing)
        while(helper.size() > 0){ // coping the temp stack back to original stack
            st.push(helper.pop());
        }
        System.out.println("Updated stack:"+st);
    }
}
