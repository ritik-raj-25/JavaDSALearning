package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void print(int[] arr){
        for(int i=0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4}; // Given array
        int[] res = new int[arr.length]; // Ans array

        print(arr);
        // Method - 1
        // Solution: Without using extra space
        // T.C.: O(n*n)
        // Auxilary Space: O(1)
        for(int i=0; i<arr.length; ++i){
            res[i] = -1;
            for(int j=i+1; j<arr.length; ++j){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        print(res);

        // Method - 2
        // Solution: using Stack
        // T.C.: O(n)
        // Auxilary Space: O(n)
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; --i){
            while(st.size()!=0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        print(res);

        // Method - 3
        // Solution: using Stack
        // T.C.: O(n)
        // Auxilary Space: O(n)
        Stack<Integer> rt = new Stack<>();
        rt.push(0);
        for(int i=1; i<arr.length; ++i){
            while(rt.size()>0 && arr[rt.peek()]<arr[i]){
                res[rt.peek()] = arr[i];
                rt.pop();
            }
            rt.push(i);
        }
        while(rt.size()>0){
            res[rt.pop()] = -1;
        }
        print(res);
    }
}