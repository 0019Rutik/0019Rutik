import org.w3c.dom.Node;
class LinkedList {
    // head of the lis
    Node head;
    public LinkedList (){
        this.head = null;
    }

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    // add  a node at front ;
    public void push(int new_data){
        Node new_node = new Node(new_data) ;
        new_node.next = head;
        head = new_node;
    }
    // Add a node after given node

   public void insertAfter(node prev_node , int new_data){
        if(prev_node == null ){
            System.out.println("the given previous node cannot be null");
           return;
       }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(6);
        System.out.println(llist);
    }



    
    
}
