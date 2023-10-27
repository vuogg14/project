package Hw3_22001604_DoChiKien.exc10;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int n = 0;

    public void add(int val) {
        if (n == 0) {
            head = new Node(val);
            tail = head;
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
        n++;
    }

    public void reverse() {
        Node prev = null;
        Node pres = head;
        tail = pres;
        Node next = pres.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        Node node = head;
        while (node != null) {
            myStr.append(node.data).append(" ");
            node = node.next;
        }
        return myStr.toString();
    }
}
