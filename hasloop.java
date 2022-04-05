import java.util.HashSet;
import java.util.Set;

public class hasloop {
    
        class Node{
            int data;
            Node next;
        
        public  Node(int data){
             this.data = data;
            this.next = null;
        }
        
    }
    public static Node head= null;
     public Node tail = null;
    
/*public boolean loop(Node head){
    if(head == null || head.next == null){
        return false;

    }
    Node slow = head;
    Node fast = head.next;
    while(slow !=fast){
      if(fast == null || fast.next=null){
          return false;
      }
      slow = slow.next;
      fast = fast.next;
    }
    return true;
}
*/
public void display(){
    // Node currenrkly to head
    Node current = head;

    if(head == null){
        System.out.println("list is empty");
        //return false;

    }
    System.out.println("Node of singly linked list");
    while(current != null){
        System.out.println(current.data +" ");
        // print each node in incrementing point
        current = current.next;

    }
    System.out.println();
}
public static Node Findintersection(Node nodeA , Node nodeB){
    if(nodeA == null || nodeB == null){
        return null;
    }
    Set<Node> nodeset = new HashSet<>();
    Node tempA = nodeA;
    while(tempA!= null){
        nodeset.add(tempA);
        tempA = tempA.next;
    }
    Node tempB = nodeB;
    while(tempB!= null){
        if(nodeset.contains(tempB)){
            return tempB;
        }
        tempB = tempB.next;

    }
    return null;
}

public static void main(String[] args) {
    int Node = Findintersection(nodeA, nodeB)
    
}
}
