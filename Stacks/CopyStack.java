//Copy contents of one stack to another in same order
//T.C.: O(n)
//S.C.: O(n)

package Stacks;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  //Original stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: "+st);

        Stack<Integer> gt = new Stack<>(); //Helper stack
        while(st.size() > 0){
            gt.push(st.pop());
        }

        Stack<Integer> ans = new Stack<>(); //Copied stack
        while(gt.size() > 0){
            ans.push(gt.pop());
        }
        System.out.println("Copied Stack: "+ans);
    }
}
