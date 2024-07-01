package Queues;

class CircularQueue{
    private int[] queue = new int[5];
    private int front = -1;
    private int rear = -1;
    private int size = 0;

    public void add(int val) throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == queue.length){
            throw new Error("Queue Overflow...");
        }
        if(front == -1) ++front;
        ++rear;
        queue[rear%queue.length] = val;
        ++size;
    } 
    public int remove() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue Underflow...");
        }
        int x = queue[front%queue.length];
        ++front;
        --size;
        return x;
    }
    public int peek(){
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue Underflow...");
        }
        return queue[front%queue.length];
    }
    public void printQueue() throws Error{
        //T.C.: O(size)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue Underflow...");
        }
        System.out.print("The queue is: ");
        for(int i=front; i<=rear; ++i){
            System.out.print(queue[i%queue.length]+" ");
        }
        System.out.println();
    }
    public int size(){
        //T.C.: O(1)
        //S.C.: O(1)
        return size;
    }
    public boolean isEmpty(){
        //T.C.: O(1)
        //S.C.: O(1)
        return size==0;
    }
}

public class ArrayImplementationOfCircularQueue {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.printQueue();
        System.out.println("The size of queue is: "+cq.size());

        System.out.println("The removed element is: "+cq.remove());
        cq.printQueue();
        cq.add(50);
        cq.add(60);
        cq.printQueue();
        System.out.println("The size of queue is: "+cq.size());

        System.out.println("The fornt-most element of queue is: "+cq.peek());

        System.out.println("The size of queue is: "+cq.size());

        System.out.println("Is queue empty?"+cq.isEmpty());
    }
}
