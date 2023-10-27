package hw3_22001665_CaoSyNguyenVu.ex5.codelearn27;

import hw3_22001665_CaoSyNguyenVu.ex6.MyLinkedList;

/**
 * Enter a positive integer n, set up a double list to store numbers from n down to 1 and from 1 up top n.
 * In that linked list, after each element there is a space
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
    public int size(){
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

    public void display() {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
