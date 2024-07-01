package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementsAtEvenIndex {
    //T.C.: O(n)
    //S.C.: O(n)
    public static void deleteElementsAtEvenIndex(Queue<Integer> que){
        Queue<Integer> q = new LinkedList<>();
        while(que.size() > 0){
            que.remove();
            if(que.size() > 0) q.add(que.remove());
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
        que.add(60);
        que.add(70);
        que.add(80);
        que.add(90);
        System.out.print("The Queue is(Old queue): "+que);
        deleteElementsAtEvenIndex(que);
        System.out.print("The Queue is(New/Updated queue): "+que);
    }
}
