package Hw3_22001604_DoChiKien.exc6;

public class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int n = 0;

    public MyLinkedList() {
    }

    public int get(int index) {
        if (index < 0 || index >= n) {
            return -1;
        }
        return getNodeAtIndex(index).val;
    }

    public void addAtHead(int val) {
        if (n == 0) {
            head = new Node(val);
            tail = head;
        } else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        n++;
    }

    public void addAtTail(int val) {
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

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > n) {
            return;
        } else if (index == 0) {
            addAtHead(val);
        } else if (index == n) {
            addAtTail(val);
        } else {
            Node prev = getNodeAtIndex(index - 1);
            Node next = prev.next;
            Node node = new Node(val);
            prev.next = node;
            node.next = next;
            n++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= n) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else if (index == n - 1) {
            Node node = getNodeAtIndex(index - 1);
            node.next = null;
            tail = node;
        } else {
            Node node = getNodeAtIndex(index - 1);
            node.next = node.next.next;
        }
        n--;
    }

    public Node getNodeAtIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
