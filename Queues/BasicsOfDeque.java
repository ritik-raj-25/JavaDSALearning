package Queues;

import java.util.LinkedList;
import java.util.Deque;

public class BasicsOfDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addLast(50);
        System.out.println("The Deque is "+dq);
        System.out.println("Size of deque is "+dq.size());

        dq.addFirst(60);
        dq.addFirst(70);
        dq.addFirst(80);
        dq.addFirst(90);
        System.out.println("The Deque is "+dq);
        System.out.println("Size of deque is "+dq.size());

        System.out.println("The removed element is (front)"+dq.removeFirst());
        System.out.println("The removed element is (rear)"+dq.removeLast());
        System.out.println("The Deque is "+dq);
        System.out.println("Size of deque is "+dq.size());

        System.out.println("The front-most element is (front)"+dq.getFirst());
        System.out.println("The rear-most element is (rear)"+dq.getLast());
        System.out.println("The Deque is "+dq);
        System.out.println("Size of deque is "+dq.size());

        System.out.println("Is deque empty?"+dq.isEmpty());
    }
}
