package Queues;

//import java.util.ArrayDeque;
import java.util.LinkedList;
//import java.util.PriorityQueue;
import java.util.Queue;

public class BasicsOfQueues {
    public static void main(String[] args) {
        //Declaration of Queue
        // 1.
        Queue<Integer> que = new LinkedList<>();
        // 2.
        //Queue<Integer> qu = new ArrayDeque<>();
        // 3.
        //Queue<Integer> q = new PriorityQueue<>();

        //Basic Operations on Queue
        //1. add() --> insertion of element from rear of the Queue
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que); //Printing the Queue

        //2. remove()/poll() --> deletion of element from the front of the Queue
        System.out.println("The deleted element is "+que.remove());
        System.out.println("The deleted element is "+que.poll());
        System.out.println(que);

        //3. peek()/element() --> viewing the front-most element of the Queue
        System.out.println("The front-most element is "+que.peek());
        System.out.println("The fornt-most element is "+que.element());
        System.out.println(que);

        //Auxilary operations on Queue
        //1. size() --> It will return the size of the Queue
        System.out.println("Size of the stack is "+que.size());

        // 2. isEmpty() --> It will check whether the Queue is empty or not
        System.out.println("Is queue empty?"+que.isEmpty());
    }
}