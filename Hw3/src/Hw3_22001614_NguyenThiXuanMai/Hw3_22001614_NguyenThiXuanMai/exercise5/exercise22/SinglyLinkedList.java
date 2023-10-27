package Hw3_22001614_NguyenThiXuanMai.exercise5.exercise22;

import java.util.Scanner;

public class SinglyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void createLinkedList() {
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
        int index = sc.nextInt();
        int value = sc.nextInt();
        addAtIndex(index, value);
        print();
    }

    private void addAtIndex(int index, int val) {
        if (head == null) {
            head = new Node(val);
        } else if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        } else {
            Node newNode = new Node(val);
            Node prev;
            Node cur = head;
            int count = 0;
            while (cur.next != null) {
                prev = cur;
                cur = cur.next;
                count++;
                if (count == index) {
                    prev.next = newNode;
                    newNode.next = cur;
                    break;
                }
            }
            if (index > count) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
    }

    private void print() {
        Node cur = head;
        while (cur.next != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
}
