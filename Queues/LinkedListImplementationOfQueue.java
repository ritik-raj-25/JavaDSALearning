package Queues;

class Node{
    public int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkedListQueue{
    private Node frontNode;
    private Node rearNode;
    private int size;

    public void add(int val){
        //T.C.: O(1)
        //S.C.: O(1)
        Node temp = new Node(val);
        if(frontNode == null){
            frontNode = rearNode = temp;
        }
        else{
            rearNode.next = temp;
            rearNode = temp; 
        }
        ++size;
    }
    public int remove() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        int x = frontNode.val;
        frontNode = frontNode.next;
        --size;
        return x;
    }
    public int peek(){
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        return frontNode.val;
    }
    public void printQueue(){
        //T.C.: O(size)
        //S.C.: O(1)
        System.out.print("The queue is: ");
        Node temp = frontNode;
        while(temp != null){
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

public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        LinkedListQueue lq = new LinkedListQueue();
        lq.add(10);
        lq.add(20);
        lq.add(30);
        lq.add(40);
        lq.add(50);
        lq.printQueue();
        System.out.println("Size of queue is:"+lq.size());

        System.out.println("The removed element is:"+lq.remove());
        lq.printQueue();
        System.out.println("Size of queue is: "+lq.size());

        System.out.println("The front-most element is:"+lq.peek());
        lq.printQueue();
        System.out.println("Size of queue is: "+lq.size());

        System.out.println("Is queue Empty? "+lq.isEmpty());
    }
}
