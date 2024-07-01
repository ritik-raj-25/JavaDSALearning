package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveLast{
    public static void removelast(Queue<Integer> q, int k){
        int n = q.size();
        for(int i=1; i<=n; ++i){
            if(i<=n-k){
                q.add(q.remove());
            }
            else q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 4; //number of elements to be deleted from last
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
        removelast(q,k);
        System.out.println("The updated queue is: "+q);
    }
}