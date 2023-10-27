package Hw3_22001614_NguyenThiXuanMai.exercise5.exercise21;

import java.util.Scanner;

public class SinglyLinkedList {
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
        print(array[0]);
    }

    private void print(Node head) {
        Node cur = head;
        while (cur.next != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
}
