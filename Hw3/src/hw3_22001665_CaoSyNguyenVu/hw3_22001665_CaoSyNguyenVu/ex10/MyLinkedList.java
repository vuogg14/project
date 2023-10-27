package hw3_22001665_CaoSyNguyenVu.ex10;

public class MyLinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Node reverseList() {
        if (head == null) return null;
        Node res = new Node();
        res.data = head.data;
        tail = res;
        Node run = head.next;
        while (run != null) {
            Node tmp = new Node();
            tmp.data = run.data;
            tmp.next = res;
            res = tmp;
            run = run.next;
        }
        head = res;
        return res;
    }

    public void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
