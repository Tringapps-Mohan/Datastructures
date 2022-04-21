import datastructures.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Linkedlist list = new Linkedlist();
        Node node_A = new Node(10);
        Node node_B = new Node(20);
        Node node_C = new Node(30);       
        Node node_D = new Node(40);
        
        list.add_at_end(node_A);
        list.add_at_end(node_B);
        list.add_at_end(node_C);
        list.add_at_end(node_D);

        list.add_at_start(new Node(5));
        list.add_at_middle(new Node(2));
        
        list.print_list();
        
        Linkedlist list2= new Linkedlist();
        
        list2.add_at_end(new Node(100));
        list.append_list(list2);
        list.print_list();
        
        list2=list;
        
        System.out.println(list.search(2));
        
        list.to_empty();//Now list is empty
        
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        
        list2.delete_node(2);
        list2.print_list();
        list2.delete_tail();
        list2.delete_node(100);
        list2.print_list();
    

        Stack mystack=new Stack();
        mystack.push(100);
        mystack.push(102);
        mystack.push(104);
        mystack.push(700);
        System.out.println(mystack.pop());
        mystack.print_stack();

        System.out.println();

        Queue myqueue = new Queue();
        myqueue.peek();
        myqueue.enqueue(10);
        myqueue.enqueue(20);
        myqueue.enqueue(20);
        myqueue.enqueue(20);

        myqueue.print_queue();
        myqueue.enqueue(70);
        myqueue.print_queue();
        myqueue.dequeue();
        myqueue.print_queue();
        //System.out.println(myqueue.first.data);
        System.out.println(myqueue.peek());
    }
}