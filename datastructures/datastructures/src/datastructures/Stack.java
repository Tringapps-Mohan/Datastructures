package datastructures;

public class Stack {
    private Node top;
    public Stack(){
        //creating a new stack
        top=null;
    }

    //Function for Push operation
    public void push(int data){
        Node temp=new Node(data);
        temp.next=top;
        top=temp;
    }

    //Function for Pop operation
    public int pop(){
        int value=top.data;
        top=top.next;
        return value;
    }

    //Function for check is stack is empty or not
    public boolean isEmpty(){
        return top==null?true:false;
    }

    //Function for print the stack
    public void print_stack(){
        for(Node temp=top;temp!=null;temp=temp.next){
            System.out.print(temp.data);
            if(temp.next!=null)
            System.out.print(",");
        }
    }
}