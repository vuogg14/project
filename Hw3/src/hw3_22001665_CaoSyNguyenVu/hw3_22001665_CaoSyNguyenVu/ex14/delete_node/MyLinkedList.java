package hw3_22001665_CaoSyNguyenVu.ex14.delete_node;

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
     * Given a doubly linked list and a position.
     * The task is to delete a node from given position in a doubly linked list.
     * Position starts from 0.
     */
    public void deleteNode(int pos) {
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
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
