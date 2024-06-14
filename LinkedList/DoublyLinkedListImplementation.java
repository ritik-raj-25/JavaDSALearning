package LinkedList;

class ListNode{
    ListNode prev;
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

class DoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    private int size;

    public void insertAtTail(int val){ //T.C.: O(1)
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        ++size;
    }
    public void insertAtHead(int val){ //T.C.: O(1)
        ListNode temp = new ListNode(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        ++size;
    }
    public void insert(int indx, int val) throws Error{ //T.C.: O(size)
        if(indx == 0){
            insertAtHead(val);
            return;
        }
        if(indx == size){
            insertAtTail(val);
            return;
        }
        if(indx<0 || indx>size){
            throw new Error("Invalid Indx");
        }
        ListNode temp = new ListNode(val);
        ListNode x = head;
        for(int i=1; i<indx; ++i){ //indx-1 jumbs
            x = x.next; 
        }
        temp.next = x.next;
        temp.prev = x;
        temp.next.prev = temp;
        x.next = temp;
        ++size;
    }
    public void deleteAtTail() throws Error{ //T.C.: O(1)
        if(head == null){
            throw new Error("Linked List is empty...\n");
        }
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        --size;
    }
    public void deleteAtHead() throws Error{ //T.C.: O(1)
        if(head == null){
            throw new Error("Linked List is empty...\n");
        }
        head = head.next;
        head.prev.next = null;
        head.prev = null;
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
            throw new Error("Invalid Indx");
        }
        ListNode x = head;
        for(int i=1; i<indx; ++i){
            x = x.next;
        }
        x.next = x.next.next;
        x.next.prev.next = null;
        x.next.prev.prev = null;
        x.next.prev = x;
        --size;
    }
    public int get(int indx) throws Error{ //T.C.: O(size)
        if(indx>=size || indx<0){
            throw new Error("Invalid Index!");
        }
        ListNode x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        return x.val;
    }
    public void set(int indx, int val) throws Error{ //T.C.: O(size)
        if(indx>=size || indx<0){
            throw new Error("Invalid Index!");
        }
        ListNode x = head;
        for(int i=1; i<=indx; ++i){
            x = x.next;
        }
        x.val = val;
    }
    public void display(){ //T.C.: O(n)
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size(){ //T.C.: O(1)
        return size;
    }
}

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.display();

        dll.insertAtHead(1);
        dll.insertAtHead(3);
        dll.insertAtHead(5);
        dll.display();

        dll.insert(3,100);
        dll.display();

        dll.deleteAtTail();
        dll.display();

        dll.deleteAtHead();
        dll.display();

        dll.delete(2);
        dll.display();

        System.out.println(dll.get(2));

        dll.set(2, 100);
        dll.display();

        System.out.println(dll.size());
    }
}
