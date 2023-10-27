package Hw3_22001614_NguyenThiXuanMai.exercise5.exercise24;

import java.util.Scanner;

public class SinglyLinkedList {
    Node head;
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

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
        getValueAtIndex(index);
    }

    private void getValueAtIndex(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
            if (cur == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
        System.out.println(cur.val);
    }
}
