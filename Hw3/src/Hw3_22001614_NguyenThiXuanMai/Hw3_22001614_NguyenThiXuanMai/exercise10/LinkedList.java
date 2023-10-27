package Hw3_22001614_NguyenThiXuanMai.exercise10;

import java.util.Scanner;

public class LinkedList {
    private Node head;
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    void createLinkedList() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] array = new Node[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Node(sc.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            array[i].next = array[i + 1];
        }
        head = array[0];
    }

    void reverse() {
        Node prev = null;
        Node cur = head;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.println("NULL");
    }
}
