package Stacks;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class StackLL{
    private Node head;
    private int size;

    public void push(int x){
        Node temp = new Node(x);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        ++size;
    }
    public int pop() throws Error{
        if(head == null) { //size == 0 --> stack is empty
            throw new Error("Stack Underflow...");
        }
        int x = head.val;
        head = head.next;
        --size;
        return x;
    }
    public int peek() throws Error{
        if(head == null) { //size == 0 --> stack is empty
            throw new Error("Stack Underflow...");
        }
        return head.val;
    }
    private void displayHelper(Node head){
        if(head == null) return;
        displayHelper(head.next);
        System.out.print(head.val+" ");
    }
    public void display(){
        displayHelper(head);
        System.out.println();
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
} 

public class ImplementationOfStackUsingLinkedList {
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();

        System.out.println(st.pop());
        st.display();

        System.out.println(st.peek());
        st.display();

        System.out.println(st.size());

        System.out.println(st.isEmpty());
    }
}
