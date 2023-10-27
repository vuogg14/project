package hw3_22001665_CaoSyNguyenVu.ex8;

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

    public int getNthFromLast(int pos) {
        if (pos > size || pos < 0) return -1;
        Node tmp = head;
        for (int i = 0; i < size - pos; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void display() {
        for (Node node = head; node != null; node = node.next){
            System.out.print(node.data+" ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
