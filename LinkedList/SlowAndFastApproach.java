package LinkedList;

class CreateSinglyLinkedList{
    private Node head;
    private Node tail;
    public void insertAtTail(int data){ 
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
    }

    //solution :: right middle node of the LL using 'slow fast approach'
    public Node rightMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //solution :: left middle node of the LL using 'slow fast approach'
    public Node leftMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class SlowAndFastApproach {
        public static void main(String[] args) {
        CreateSinglyLinkedList ll = new CreateSinglyLinkedList();
        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.insertAtTail(5);
        ll.insertAtTail(6);

        Node mid = ll.rightMiddleNode();
        System.out.println(mid.data);

        mid = ll.leftMiddleNode();
        System.out.println(mid.data);
    }
}
