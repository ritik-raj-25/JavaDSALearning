package Queues;

class CircularQueueLL{
    private Node frontNode;
    private Node rearNode;
    private int size;

    public void add(int val){
        //T.C.: O(1)
        //S.C.: O(1)
        Node temp = new Node(val);
        if(frontNode == null){ //size == 0
            frontNode = rearNode = temp;
        }
        else{
            rearNode.next = temp;
            rearNode = temp;
        }
        ++size;
        rearNode.next = frontNode;
    }
    public int remove()throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        int x = frontNode.val;
        frontNode = frontNode.next;
        rearNode.next = frontNode;
        --size;
        return x;
    }
    public int peek() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        return frontNode.val;
    }
    public void printQueue() throws Error{
        //T.C.: O(size)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        System.out.print("The queue is: ");
        Node temp = frontNode;
        System.out.print(temp.val+" ");
        temp = temp.next;
        while(temp != frontNode){
            System.out.print(temp.val+" ");
            temp = temp.next;
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

public class LinkedListImplementationOfCircularQueue {
    public static void main(String[] args) {
        CircularQueueLL cq = new CircularQueueLL();
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
