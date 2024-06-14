package LinkedList;

class LinkedListNode{
    public int val;
    public LinkedListNode next;
    LinkedListNode(int val){
        this.val = val;
    }
}

class CircularSinglyLinkedList{
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public void insertAtTail(int val){ //T.C.: O(1)
        LinkedListNode temp = new LinkedListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        tail.next = head;
        ++size;
    }
    public void insertAtHead(int val){ //T.C.: O(1)
        LinkedListNode temp = new LinkedListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        tail.next = head;
        ++size;
    }
    public void insert(int indx, int val) throws Error{ //T.C.: O(size)
        if(indx==0){ 
            insertAtHead(val);
            return;
        }
        if(indx == size){
            insertAtTail(val);
            return;
        }
        if(indx>size || indx<0){
            throw new Error("Invalid Index!");
        }
        LinkedListNode temp = new LinkedListNode(val);
        LinkedListNode x = head;
        for(int i=1; i<indx; ++i){ //indx-1 jumps
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        ++size;
    }
    public void deleteAtHead() throws Error{ //T.C.: O(1)
        if(head == null){ //size == 0
            throw new Error("Linked List is empty!");
        }
        if(head == tail){ //size == 1
            head = tail = null;
        }
        else{
            head = head.next;
        }
        tail.next = head;
        --size;
    }
    public void deleteAtTail() throws Error{ //T.C.: O(size)
        if(head == null){ //size == 0
            throw new Error("Linked List is empty!");
        }
        if(head == tail){ //size == 1
            head = tail = null;
        }
        else{
            LinkedListNode x = head;
            while(x.next.next != head){
                x = x.next; 
            }   
            x.next = head;
            tail=x;
        }
        --size;
    }
    public void delete(int indx) throws Error{ //T.C.: O(size)
        if(indx == 0){
            deleteAtHead();
            return;
        }
        if(indx == size-1){
            deleteAtTail();
            return;
        }
        if(indx<0 || indx>=size){
            throw new Error("Invalid Index!");
        }
        LinkedListNode x = head;
        for(int i=1; i<indx; ++i){ //indx-1 jumps
            x = x.next;
        }
        x.next = x.next.next;
        --size;
    }
    public int get(int indx) throws Error{ //T.C.: O(size)
        if(indx<0 || indx>=size){
            throw new Error("Invalid Index!");
        }
        LinkedListNode x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        return x.val;
    }
    public void set(int indx, int val) throws Error{ //T.C.: O(size)
        if(indx>=size || indx<0){
            throw new Error("Invalid Index!");
        }
        LinkedListNode x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        x.val = val;
    }
    public void display(){ //T.C.: O(size)
        System.out.print(head.val+" ");
        LinkedListNode x = head.next;
        while(x != head){
            System.out.print(x.val+" ");
            x = x.next;
        }
        System.out.println();
    }
    int size(){
        return size;
    }
}

public class CircularSinglyLinkedListImplementation {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertAtTail(10);
        csll.insertAtTail(20);
        csll.insertAtTail(30);
        csll.display();

        csll.insertAtHead(1);
        csll.insertAtHead(5);
        csll.insertAtHead(7);
        csll.display();

        csll.insert(2,100);
        csll.display();

        csll.deleteAtHead();
        csll.display();

        csll.deleteAtTail();
        csll.display();

        csll.delete(2);
        csll.display();

        System.out.println(csll.get(3));

        csll.set(2, 200);
        csll.display();

        System.out.println(csll.size());
    }
}