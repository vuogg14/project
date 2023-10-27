package hw3_22001665_CaoSyNguyenVu.ex15;

public class MyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addHead(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.next = head;
            head.prev = tmp;
            head = tmp;
        }
        size++;
    }

    public void addTail(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.prev = tail;
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    /**
     * Given a doubly-linked list, rotate the linked list counter-clockwise by N nodes.
     * Here N is a given positive integer and is smaller than the count of nodes in linked list.
     */
    public void rotate(int n) {
        if (n <= 0) return;
        n = n % size;
        head.prev = tail;
        tail.next = head;
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        tail = head.prev;
        head.prev = null;
        tail.next = null;
    }

    public void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
