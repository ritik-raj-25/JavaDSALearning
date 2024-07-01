package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    //T.C.: O(n)
    //S.C.: O(n)
    public static void printQueue(Queue<Integer> que){
        Queue<Integer> q = new LinkedList<>();
        while(que.size() > 0){
            System.out.print(que.peek()+" ");
            q.add(que.remove());
        }
        while(q.size() > 0){
            que.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.print("The Queue is: ");
        printQueue(que);
    }
}
