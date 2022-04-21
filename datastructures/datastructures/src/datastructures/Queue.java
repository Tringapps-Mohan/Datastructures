package datastructures;

public class Queue {
    Node first = null;
    Node last = null;

    //Function for enqueue operation

    public void enqueue(int data){
        Node node = new Node(data);
        if(last==null){
            first = last = node; 
            return;
        }
        
        last.next = node;
        last = node;
        
    }

     //Function for dequeue operation
    public void dequeue(){
        if(first==null){
            return;
        }
        first=first.next;
        if(first==null){
            last=null;
        }
    }

     //Function for print queue
    public void print_queue(){
        System.out.print("[");
        for(Node temp = first;temp!=null ; temp=temp.next){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public int peek() throws Exception
    {
        // check for an empty queue
        if (first == null) {
            throw new Exception("queue is empty! Can't do this");
        }
 
        return first.data;
    }
    
}