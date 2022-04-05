import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class intNode2 {
    public static Node head = null;
    public Node tail = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // represent the head and tail of singlly linkedd list

    // add a Node

    public void addNode(int data) {
        Node temp = new Node(data);
        // check if the list is empty
        if (head == null) {
            head = temp;

            tail = temp;
        } else {
            Node temp2 = new Node(data);
            temp2.next = head;
            head = temp2;
        }
    }

    // display() will display all the nodes present in thhe list
    public void display() {
        // Node currenrkly to head
        Node current = head;

        if (head == null) {
            System.out.println("list is empty");
            // return false;

        }
        System.out.println("Node of singly linked list");
        while (current != null) {
            System.out.println(current.data + " ");
            // print each node in incrementing point
            current = current.next;

        }

    }

    // Count the total Nodes
    public int countNodes() {
        int count = 0;
        // node current will point to head
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Insert Node at the end
    public Node insertAtEnd(int data) {
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

    // to print middle element

    public int MiddleElement() {
        Node slow = head;
        Node Fast = head;
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;
        }
        return slow.data;

    }

    // Reverse a Node
    public Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public boolean hasloop22(Node head){
      if(head == null ){
      return false;
      
      }
      Node slow = head;
      Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if( fast == slow){
            return true;
        }
    }
      
      
      return false;
    }


    public static boolean hasloop(Node head) {
        Set<Node> nodevisited = new HashSet<>();
        while (head != null) {
            if (nodevisited.contains(head)) {
                return true;
            } else {
                nodevisited.add(head);
                head = head.next;
            }

        }
        return false;

    }

    public static Node Findintersection(Node nodeA, Node nodeB) {
        if (nodeA == null || nodeB == null) {
            return null;
        }
        Set<Node> nodeset = new HashSet<>();
        Node tempA = nodeA;
        while (tempA != null) {
            nodeset.add(tempA);
            tempA = tempA.next;
        }
        Node tempB = nodeB;
        while (tempB != null) {
            if (nodeset.contains(tempB)) {
                return tempB;
            }
            tempB = tempB.next;

        }
        return null;
    }

    // delete a node
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    /*
     * public listNode addNumbers(listNode l1 , listNode l2){
     * listNode head = new listNode(0);
     * listNode result = head;
     * int carry = 0;
     * int sum =0;
     * while(l1 != null || l2 !=null){
     * sum =0;
     * if(l1!=null){
     * sum = sum + l1.data;
     * l1 = l1.next;
     * }
     * if(l2 != null){
     * l2 = l2.next;
     * 
     * }
     * sum = sum + carry;
     * carry = sum/10;
     * result.next = new listNode(sum%20);;
     * result = result.next;
     * }
     * return head.next;
     * 
     * }
     */
    // palindrome linked list...
    public static boolean palindrome(Node head) {
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != st.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public void oddEvenNode() {
        Node temp = head;
        Node result = new Node(temp.data);
        Node oddEvenNode = result;
        int count = 1;
        while (temp != null) {
            if (count % 2 == 1) {
                oddEvenNode.next = new Node(temp.data);
                oddEvenNode = oddEvenNode.next;
            }
            temp = temp.next;
            count++;
        }
        temp = head;
        count = 1;
        while (temp != null) {
            if (count % 2 == 0) {
                oddEvenNode.next = new Node(temp.data);
                oddEvenNode = oddEvenNode.next;
            }
            temp = temp.next;
            count++;
        }
        oddEvenNode.next = null;
        // return result.next;
        System.out.println(result.next);
    }

    // to find the odd (starting ) and even after the odd nodes
    public static Node oddEvenList(Node head) {
        if (head == null) {
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenhead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

    // sortlinked ..
    public Node sortLinkedList() {
        int[] countArr = { 0, 0, 0 };
        Node temp = head;
        while (temp != null) {
            countArr[temp.data]++;
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            if (countArr[i] == 0) {
                i++;
            } else {
                temp.data = i;
                countArr[i]--;
                temp = temp.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        intNode2 slist = new intNode2();
        slist.addNode(4);
        slist.addNode(3);
        slist.addNode(2);
        slist.addNode(2);
        slist.addNode(2);
        slist.addNode(2);
        slist.addNode(2);
        slist.addNode(1);
        //slist.display();
        // deleteNode(head.next.next);
        // slist.display();
        // Node temp = head;

        // System.out.println(slist.reverse(head));

        // Node temp = head;
       System.out.println(slist.hasloop22(head));
        slist.display();
        // System.out.println(temp);
        // slist.display();

        // System.out.println(slist.palindrome(head));
        // System.out.println(slist.oddEvenList());
        // slist.oddEvenNode(head);

        // slist.display();
        // slist.sortLinkedList();
        // slist.sortLinkedList();
        // slist.display();

        // System.out.println(slist.hasloop(head));
        // slist.display();
        // System.out.println(slist.reverse(head));
        // slist.display();

    }
}
