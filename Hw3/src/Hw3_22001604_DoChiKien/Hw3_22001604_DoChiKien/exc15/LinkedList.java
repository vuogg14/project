package Hw3_22001604_DoChiKien.exc15;

public class LinkedList {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    int n = 0;

    public LinkedList() {
    }

    public void add(int val) {
        if (n == 0) {
            head = new Node(val);
            tail = head;
        } else {
            Node node = new Node(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        n++;
    }

    public int size() {
        return n;
    }

    public void rotate(int k) {
        k = k % n;
        for (int i = 0; i < k; i++) {
            Node node = head;
            head = head.next;
            head.prev = null;
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        Node node = head;
        while (node != null) {
            myStr.append(node.val).append(" ");
            node = node.next;
        }
        return myStr.toString();
    }
}
