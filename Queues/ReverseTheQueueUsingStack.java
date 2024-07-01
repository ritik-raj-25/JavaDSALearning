package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheQueueUsingStack {
    //T.C.: O(n)
    //S.C.: O(n)
    public static void reverseQueue(Queue<Integer> que){
        Stack<Integer> st = new Stack<>();
        while(que.size() > 0){
            st.push(que.remove());
        }
        while(st.size()>0){
            que.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println("Queue before reversing:"+que);
        reverseQueue(que);
        System.out.println("Queue after  reversing:"+que);
    }
}
