package Stacks;

class Stack{
    private int[] stk = new int[10];
    private int top = -1;
    private int size = 0;
    
    public void push(int x) throws Error{
        if(top == stk.length-1){ //Stack is full
            throw new Error("Stack OverFlow...");
        }
        stk[++top] = x;
        ++size;
    }
    public int pop() throws Error{ 
        if(top == -1){ //Stack is empty
            throw new Error("Stack Underflow...");
        }
        int x = stk[top];
        stk[top] = 0;
        --top;
        --size;
        return x;
    }
    public int peek() throws Error{ 
        if(top == -1){ //Stack is empty
            throw new Error("Stack Underflow...");
        }
        return stk[top];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == stk.length;
    }
    public int capacity(){
        return stk.length;
    }
    public void display(){
        for(int i=0; i<size; ++i){
            System.out.print(stk[i]+" ");
        }
        System.out.println();
    }
}

public class ImplementingStackUsingArrays {
    public static void main(String[] args) {
        Stack st = new Stack();
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

        System.out.println(st.capacity());

        System.out.println(st.isEmpty());

        System.out.println(st.isFull());
    }
}
