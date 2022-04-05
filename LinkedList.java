public class LinkedList {
     private Node head;
     private node tail;
     private int size;

     public LinkedList(){
         this.size = 0;
     }
     private class Node{
         private int value;
         private Node next;
      public node (int value){
          this.value = value;
      }
      public node (int value, Node next){
          this.value = value;
          this.next = next;
      }


    
    
    public void push(int value){
    
        
        Node temp = new Node(value);
        temp.Next = head;
        head = temp;
    }
    
    static void print(){
        Node temp = head;
        if(temp != null){
           System.out.println(temp.data + " ");
           temp = temp.Next;
        }
        
    }
    public void append(int new_data){
        Node temp = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        temp.next =null;
    }
    
    
        
    }
    
    
}
