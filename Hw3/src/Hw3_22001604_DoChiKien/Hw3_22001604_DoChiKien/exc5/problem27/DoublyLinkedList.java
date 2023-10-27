package Hw3_22001604_DoChiKien.exc5.problem27;

public class DoublyLinkedList {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int n = 0;

    public void addTail(int val) {
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

    public void addHead(int val) {
        if (n == 0) {
            head = new Node(val);
            tail = head;
        } else {
            Node node = new Node(val);
            node.next = head;
            head.prev = node;
            head = node;
        }
        n++;
    }

    public void createDoublyLinkedList(int n) throws Exception {
        if (n < 1) {
            throw new Exception("Invalid input!");
        }
        addHead(1);
        for (int i = 2; i <= n; i++) {
            addHead(i);
            addTail(i);
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
