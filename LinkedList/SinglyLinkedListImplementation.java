package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public void insertAtTail(int data){ //T.C.: O(1)
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
        ++size;
    }
    public void insertAtHead(int data){ //T.C.: O(1)
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }
        temp.next = head;
        head = temp;
        ++size;
    }
    public void insert(int indx, int data) throws Error{ //T.C.: O(size)
        if(indx==0){ 
            insertAtHead(data);
            return;
        }
        if(indx == size){
            insertAtTail(data);
            return;
        }
        if(indx>size || indx<0){
            throw new Error("Invalid Index!");
        }
        Node temp = new Node(data);
        Node x = head;
        for(int i=1; i<indx; ++i){ //indx-1 jumps
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        ++size;
    }
    public int get(int indx) throws Error{ //T.C.: O(size)
        if(indx<0 || indx>=size){
            throw new Error("Invalid Index!");
        }
        Node x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        return x.data;
    }
    public void set(int indx, int data) throws Error{ //T.C.: O(size)
        if(indx>=size || indx<0){
            throw new Error("Invalid Index!");
        }
        Node x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        x.data = data;
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
            Node x = head;
            while(x.next.next != null){
                x = x.next; 
            }   
            x.next = null;
            tail=x;
        }
        --size;
    }
    public void delete(int indx) throws Error{ //T.C.: O(size)
        if(indx == 0){
            deleteAtHead();
            return;
        }
        if(indx<0 || indx>=size){
            throw new Error("Invalid Index!");
        }
        Node x = head;
        for(int i=1; i<indx; ++i){ //indx-1 jumps
            x = x.next;
        }
        if(x.next == tail) tail = x;
        x.next = x.next.next;
        --size;
    }
    public void display(){ //T.C.: O(size)
        Node x = head;
        while(x != null){
            System.out.print(x.data+" ");
            x = x.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
}

public class SinglyLinkedListImplementation {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtTail(20);
        sll.insertAtTail(25);
        sll.insertAtTail(30);
        sll.display();

        sll.insertAtHead(15);
        sll.insertAtHead(10);
        sll.insertAtHead(5);
        sll.display();

        sll.insert(2, 8);
        sll.display();

        sll.deleteAtHead();
        sll.display();

        sll.deleteAtTail();
        sll.display();

        sll.delete(1);
        sll.display();

        System.out.println(sll.get(2));

        sll.set(2, 30);
        sll.display();

        System.out.println("Length of the linked list is "+sll.size());
    }
}