public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;
    Node tail = null;

    void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = Newnode;
            // Node current = head;
            // while (current.next != null) {
            // current = current.next;
            // }
            // current.next = newnode;
        }
    }

    void printList(){
        Node current = head 
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
}

    void addHeadfirst(int data) {
        Node = newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
}