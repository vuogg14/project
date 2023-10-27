package Hw3_22001614_NguyenThiXuanMai.exercise7;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

public class Solution {
    public static int getCount(Node head) {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
}

