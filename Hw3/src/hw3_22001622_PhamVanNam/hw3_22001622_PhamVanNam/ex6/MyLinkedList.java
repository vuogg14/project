package hw3_22001622_PhamVanNam.ex6;

public class MyLinkedList {
    static class Node {
        private final int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int n;

    public MyLinkedList() {
    }

    public int get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (n == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        n++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (n == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = new Node(val);
            tail = newNode;
        }
        n++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > n) return;
        else if (index == 0) addAtHead(val);
        else if (index == n) addAtTail(val);
        else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node newNode = new Node(val);
            newNode.next = node.next;
            node.next = newNode;
            n++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= n) return;
        else if (index == 0) head = head.next;
        else {
            Node prev;
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            prev = node;
            Node current = prev.next;
            prev.next = current.next;
        }
        n--;
    }
}
