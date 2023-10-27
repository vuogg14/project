package Hw3_22001604_DoChiKien.exc16;

public class CirculerLinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }

    }

    public void printList(Node head) {
        Node node = head;
        while (node.next != head) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public boolean isCircular(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node sortedInsert(Node head, int data) {
        if (head.data >= data) {
            Node node = new Node(data);
            node.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            return node;
        } else {
            Node node = head;
            while (node.next != head && node.next.data < data) {
                node = node.next;
            }
            Node next = node.next;
            Node current = new Node(data);
            node.next = current;
            current.next = next;
            return head;
        }
    }

    public static Node deleteNode(Node head, int d) {
        if (head.data == d) {
            Node node = head;
            while (node.next != head) {
                node = node.next;
            }
            node.next = head.next;
            return head.next;
        } else {
            Node node = head;
            while (node.next != head && node.next.data != d) {
                node = node.next;
            }
            Node next = node.next.next;
            node.next = next;
            return head;
        }
    }

    public static Node reverse(Node head) {
        Node prev = head;
        Node current = head.next;
        Node next = head.next.next;
        while (current != head) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        head.next = prev;
        return prev;
    }
}
