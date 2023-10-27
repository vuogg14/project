package Hw3_22001604_DoChiKien.exc9;

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

    public int count(int search_for) {
        int count = 0;
        Node node = head;
        while (node != null) {
            if (node.data == search_for) {
                count++;
            }
            node = node.next;
        }
        return count;
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
