package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLast {
    public static void reverselast(Queue<Integer> q, int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=n; ++i){
            if(i<=n-k){
                q.add(q.remove());
            }
            else st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        int k = 3; //number of elements to be deleted from last
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        System.out.println("The given queue is: "+q);
        reverselast(q,k);
        System.out.println("The updated queue is: "+q);
    }
}
