package hw3_22001665_CaoSyNguyenVu.ex5.codelearn29;

/**
 * Enter a positive integer n, followed by n integers of a sequence, install it into a doubly linked list.
 * Next, give two integers k and x (0 <= k < n).
 * Delete the element at index k and print the list to the screen, after an element with exactly one space
 */
public class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        size = 0;
    }

    public DoublyLinkedList(int data) {
        head = new Node();
        head.data = data;
        tail = head;
        size = 1;
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
            head = head.prev;
        }
        size++;
    }

    public void addTail(int data) {
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

    public void removeAt(int pos) {
        if (pos == 0) {
            head = head.next;
        } else if (pos == size - 1) {
            tail = tail.prev;
        } else if (pos > 0 && pos < size - 1) {
            Node crr = head;
            for (int i = 0; i < pos - 1; i++) {
                crr = crr.next;
            }
            crr.next = crr.next.next;
            crr.next.prev = crr;
        }
        size--;
    }

    public void display() {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
