package hw3_22001667_NgoHaiYen.ex7;

public class CountNodesOfLinkedList {
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
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Count of nodes: " + list.getCount());
    }

}
