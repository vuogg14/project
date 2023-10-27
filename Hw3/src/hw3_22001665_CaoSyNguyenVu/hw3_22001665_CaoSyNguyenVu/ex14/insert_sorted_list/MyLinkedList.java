package hw3_22001665_CaoSyNguyenVu.ex14.insert_sorted_list;

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
     * Given a sorted doubly linked list and an element X, your need to insert the element X into correct position in the sorted DLL.
     */
    public void addSortedInsert(int x) {
        if (head == null) {
            addHead(x);
        } else if (head.next == null) {
            if(head.data<x) addTail(x);
            else addHead(x);
        } else {
            Node crr = head;
            while (crr != null && crr.data < x) {
                crr = crr.next;
            }
            if (crr == null) {
                addTail(x);
            } else if (crr == head) {
                addHead(x);
            } else {
                Node tmp = new Node();
                tmp.data = x;

                tmp.prev = crr.prev;
                crr.prev.next = tmp;
                tmp.next = crr;
                crr.prev = tmp;
            }
        }
    }
    public void display(){
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
