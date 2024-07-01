package Queues;

class DoublyNode{
    public DoublyNode prev;
    public int val;
    public DoublyNode next;
    DoublyNode(int val){
        this.val = val;
    }
}

class Deque{
    private DoublyNode frontNode;
    private DoublyNode rearNode;
    private int size;

    public void addFirst(int val){
        //T.C.: O(1)
        //S.C.: O(1)
        DoublyNode temp = new DoublyNode(val);
        if(size == 0){
            frontNode = rearNode = temp;
        }
        else {
            temp.next = frontNode;
            frontNode.prev = temp;
            frontNode  = temp;
        }
        ++size;
    }
    public void addLast(int val){
        //T.C.: O(1)
        //S.C.: O(1)
        DoublyNode temp = new DoublyNode(val);
        if(size == 0){
            frontNode = rearNode = temp;
        }
        else {
            rearNode.next = temp;
            temp.prev = rearNode;
            rearNode = temp;
        }
        ++size;
    }
    public int removeFirst() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Deque is empty...");
        }
        int x = frontNode.val;
        frontNode = frontNode.next;
        if(frontNode == null){ //size == 1
            rearNode = null;
        }
        else{
            frontNode.prev = null;
        }
        --size;
        return x;
    }
    public int removeLast() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Deque is empty...");
        }
        int x = rearNode.val;
        rearNode = rearNode.prev;
        if(rearNode == null){ //size == 1
            frontNode = null;
        }
        else{
            rearNode.next = null;
        }
        --size;
        return x;
    }
    public int getFirst() throws Error{
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Deque is empty...");
        }
        return frontNode.val;
    }
    public int getLast(){
        //T.C.: O(1)
        //S.C.: O(1)
        if(size == 0){
            throw new Error("Deque is empty...");
        }
        return rearNode.val;
    }
    public void printQueue(){
        //T.C.: O(size)
        //S.C.: O(1)
        System.out.print("The deque is: ");
        DoublyNode temp = frontNode;
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

public class ImplementationOfDeque {
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addLast(50);
        dq.printQueue();
        System.out.println("Size of deque is "+dq.size());

        dq.addFirst(60);
        dq.addFirst(70);
        dq.addFirst(80);
        dq.addFirst(90);
        dq.printQueue();
        System.out.println("Size of deque is "+dq.size());

        System.out.println("The removed element is (front)"+dq.removeFirst());
        System.out.println("The removed element is (rear)"+dq.removeLast());
        dq.printQueue();
        System.out.println("Size of deque is "+dq.size());

        System.out.println("The front-most element is (front)"+dq.getFirst());
        System.out.println("The rear-most element is (rear)"+dq.getLast());
        dq.printQueue();
        System.out.println("Size of deque is "+dq.size());

        System.out.println("Is deque empty?"+dq.isEmpty());
    }
}
