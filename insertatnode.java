public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertatnode {
    private Node head;

    public insertatnode() {
        this.head = null;
    }

    public Node insertatnode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            // points to new node
            node.next = new Node(data);
        }
        return head;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertatnode ll = new insertatnode();
        ll.insertatnode(4);
        ll.insertatnode(7);
        ll.insertatnode(8);
        ll.print();

    }

}
