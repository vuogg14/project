package Hw3_22001604_DoChiKien.exc14;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int val) {
            this.data = val;
        }
    }

    public Node sortedInsert(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }
        if (head.data >= x) {
            Node newHead = new Node(x);
            newHead.next = head;
            head.prev = newHead;
            return newHead;
        } else {
            Node node = head;
            while (node.next != null && node.next.data < x)
                node = node.next;
            Node current = new Node(x);
            Node next = node.next;
            node.next = current;
            current.prev = node;
            current.next = next;
            if (next != null)
                next.prev = current;
            return head;
        }
    }

    // x start from 1
    public Node deleteNode(Node head, int x) throws Exception {
        int n = size(head);
        if (x < 1 || x > n) {
            throw new Exception("Index out of bound");
        }
        if (x == 1) {
            head = head.next;
            head.prev = null;
            return head;
        } else if (x == n) {
            Node node = head;
            for (int idx = 1; idx < x - 1; idx++) {
                node = node.next;
            }
            node.next = null;
            return head;
        } else {
            Node node = head;
            for (int idx = 1; idx < x - 1; idx++) {
                node = node.next;
            }
            Node next = node.next.next;
            node.next = next;
            next.prev = node;
            return head;
        }
    }

    public int size(Node head) {
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}
