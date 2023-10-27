package hw3_22001667_NgoHaiYen.ex9;

public class OccurnceOfAnIntergerInALinkedList {
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

        public int count(int search_for)
        {
            //code here
            int count = 0;
            Node temp = head;
            while( temp.next != null ){
                if ( temp.data == search_for){
                    count++;
                }
                temp = temp.next;
            }
            if ( temp.data == search_for){
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(1);
        System.out.println(list.count(1));

    }
}
