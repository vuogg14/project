package hw3_22001667_NgoHaiYen.ex8;

public class NthNodeFromEndOfLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    static class MyLinkedList {
        Node head;

        public void add(int value) {
            if (head == null) {
                head = new Node(value);
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(value);
            }
        }

        public int getCount() {
            Node temp = head;
            int count = 1;
            while (temp.next != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public int getNthFromLast(int n) {
            if (head == null) {
                return -1;
            }
            //Tim do dai cua danh sach
            int length = 0;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }
            //Kiem tra n co lon hon do dai danh sach khong
            if (length < n) {
                return -1;
            }
            //Tim phan tu thu length - n + 1
            temp = head;
            for (int i = 0; i < length - n + 1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getNthFromLast(3));

    }

}
