package Hw3_22001604_DoChiKien.exc8;

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

    public int getNthFromLast(int n) {
        int size = this.n;
        if (n > size) {
            return -1;
        }
        size = size - n;
        for (int idx = 0; idx < size; idx++) {
            head = head.next;
        }
        return head.data;
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
