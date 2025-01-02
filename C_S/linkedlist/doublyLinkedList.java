package linkedlist;

public class doublyLinkedList {
    public static class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            Node tail;
            head = tail = newnode;
        } else {
            tail.next = newnode; ///left side position   and right side represent value in case of single "="
            newnode.prev = tail;
            tail = newnode;
        }
    }

    void printList() {
        Node ccurrent = head;
        While(current = head);
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
