public class intNode {
    
    class Node{
        int data;
        Node next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
// represent the head and tail of singlly linkedd list
public Node head= null;
public Node tail = null;

public void addNode(int data){
    Node newNode = new Node(data);
    // check if the list is empty
    if(head== null){
        head = newNode;

        tail=newNode;
    }
    else{
        tail.next=newNode;
        tail= newNode;
    }
}
// display() will display all the nodes present in thhe list
public void display(){
    // Node currenrkly to head
    Node current = head;

    if(head == null){
        System.out.println("list is empty");
        return;

    }
    System.out.println("Node of singly linked list");
    while(current != null){
        System.out.println(current.data +" ");
        // print each node in incrementing point
        current = current.next;

    }
    System.out.println();
}

public static void main(String[] args) {
    Singlylinkedlist slist = new Singlylinkedlist();

}
}