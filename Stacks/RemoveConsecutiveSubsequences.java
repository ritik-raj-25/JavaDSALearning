package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static int[] removeConsecutiveSubsequences(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; ++i){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(i!=arr.length-1 && st.peek()==arr[i] && arr[i]!=arr[i+1]){
                st.pop();
            }
            else if(i==arr.length-1 && st.peek()==arr[i]){
                st.pop();
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1; i>=0; --i){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; ++i){
            arr[i] = scan.nextInt();
        }
        System.out.print("Given Array is: ");
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] ans = removeConsecutiveSubsequences(arr);
        System.out.print("Ans Array is: ");
        for(int i=0; i<ans.length; ++i){
            System.out.print(ans[i]+" ");
        }
        scan.close();
    }
}
