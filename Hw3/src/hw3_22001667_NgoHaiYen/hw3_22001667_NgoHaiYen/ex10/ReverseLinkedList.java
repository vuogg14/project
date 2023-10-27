package hw3_22001667_NgoHaiYen.ex10;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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

        public void reverse(){
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        public void print(){
            Node current = head;
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List before reverse: ");
        list.print();
        list.reverse();
        System.out.println("List after reverse: ");
        list.print();

    }
}
