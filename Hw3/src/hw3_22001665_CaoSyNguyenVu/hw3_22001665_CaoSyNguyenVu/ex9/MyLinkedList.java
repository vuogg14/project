package hw3_22001665_CaoSyNguyenVu.ex9;

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

    public int count(int data) {
        int c = 0;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == data) c++;
            tmp = tmp.next;
        }
        return c;
    }

    public void display() {
        for (Node node = head; node != null; node = node.next){
            System.out.print(node.data+" ");
        }
        System.out.println();
    }
}
