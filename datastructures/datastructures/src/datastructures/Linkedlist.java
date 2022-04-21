package datastructures;

public class Linkedlist {

    Node head; //head node
    Node tail; //tail node

    public Linkedlist(){
        head = null;
    }

    public void add_at_start(Node node){
        node.next=head;
        head=node;
    }

    public void add_at_middle(Node node){
        int length=size();
        Node temp=head;
        for(int i=1;i<(length/2);i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }

    public void add_at_end(Node node){
        if(head==null)
        {
            head = node;
            head.next=null; //Last node always points a null
        }
        else{
            tail = get_Tail(); //Get the last node
            tail.next = node;
            node.next=null; //Last node always points a null
        }
    }

    public void append_list(Linkedlist list){
        get_Tail().next=list.head;
    }

    public Node get_Tail(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }

    public void print_list(){
        System.out.print("[");
        for(Node temp = head;temp!=null ; temp=temp.next){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public int size(){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    public void to_empty(){
        head=null;
    }

    public boolean isEmpty(){
        return (head==null)?true:false;
    }

    public int countall(int num){
        Node temp = head;
        int occurrences=0;
        while(temp!=null){
            if(temp.data==num)
            occurrences++;
            temp=temp.next;
        }
        return occurrences;
    }

    public int search(int num){
        int i=0;
        for(Node temp = head; temp!=null; temp=temp.next){
            if(temp.data==num)
            return i;
            i++;
        }
        return -1;
    }

    public Node get(int num){
        for(Node temp = head; temp!=null; temp=temp.next){
            if(temp.data==num)
            return temp;
        }
        return null;
    }

    public void delete_head(){
        head=head.next;
    }

    public void delete_tail(){
        if(!(head==null || head.next==null)){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void delete_node(int num){
        Node temp=head;
        int i;
        int where=search(num);
        for(i=0;i<size();i++){
            if(i+1==where)
            temp.next=temp.next.next;
            else
            temp=temp.next;
        }
    }

}