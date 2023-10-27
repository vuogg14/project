package Hw3_22001666_LeMinhVuong.ex10;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkList {


    public Node reverse(Node head) {
        Node previous = null;
        Node current = null;
        Node next = head;
        while (next != null) {
            current = next;
            next = current.next;
            current.next = previous;
            previous = current;
        }
        return previous;
    }

    public void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
