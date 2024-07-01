package Queues;

class ArrayQueue{
    private int[] queue = new int[10];
    private int front = -1;
    private int rear = -1;
    private int size = 0;

    public void add(int val) throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(rear == queue.length-1) { //Queue Overflow
            throw new Error("Queue is full...");
        }
        if(front == -1) ++front;
        queue[++rear] = val;
        ++size;
    }
    public int remove() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is Empty...");
        }
        int x = queue[front];
        ++front;
        --size;
        return x;
    }
    public int peek() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is Empty...");
        }
        return queue[front];
    }
    public void printQueue() throws Error{
        //T.C.: O(size)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is Empty...");
        }
        System.out.print("The queue is: ");
        for(int i=front; i<=rear; ++i){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        //T.C.: O(1)
        //S.C.: O(1)
        return size==0;
    }
    public int size(){
        //T.C.: O(1)
        //S.C.: O(1)
        return size;
    }
}

public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        aq.add(10);
        aq.add(20);
        aq.add(30);
        aq.add(40);
        aq.add(50);
        aq.printQueue();
        System.out.println("Size of queue is: "+aq.size());

        System.out.println("The removed element is:"+aq.remove());
        aq.printQueue();
        System.out.println("Size of queue is: "+aq.size());

        System.out.println("The front-most element is:"+aq.peek());
        aq.printQueue();
        System.out.println("Size of queue is: "+aq.size());

        System.out.println("Is queue Empty? "+aq.isEmpty());
    }
}
