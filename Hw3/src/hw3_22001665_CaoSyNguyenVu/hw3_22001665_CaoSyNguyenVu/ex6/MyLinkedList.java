package hw3_22001665_CaoSyNguyenVu.ex6;

public class MyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }
    public int size(){
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void addAtHead(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.next = head;
            head.prev = tmp;
            head = head.prev;
        }
        size++;
    }

    public void addAtTail(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (tail == null) {
            tail = tmp;
            head = tail;
        } else {
            tmp.prev = tail;
            tail.next = tmp;
            tail = tail.next;
        }
        size++;
    }

    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addAtHead(data);
        } else if (index == size) {
            addAtTail(data);
        } else if (index > 0 && index < size) {
            Node crr = head;
            for (int i = 0; i < index; i++) {
                crr = crr.next;
            }

            Node tmp = new Node();
            tmp.data = data;

            tmp.prev = crr.prev;
            crr.prev.next = tmp;
            tmp.next = crr;
            crr.prev = tmp;
            size++;
        }
    }

    public void deleteAtIndex(int pos) {
        if (pos == 0) {
            head = head.next;
            size--;
        } else if (pos == size - 1) {
            tail = tail.prev;
            size--;
        } else if (pos > 0 && pos < size - 1) {
            Node crr = head;
            for (int i = 0; i < pos - 1; i++) {
                crr = crr.next;
            }
            crr.next = crr.next.next;
            crr.next.prev = crr;
            size--;
        }
    }

    public void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data+" ");
        }
    }
}
