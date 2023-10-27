package hw3_22001667_NgoHaiYen.ex12;

public class RemoveDuplicatesFromSortedList {
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

    }
        public static void main(String[] args) {
            MyLinkedList list = new MyLinkedList();
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(4);
            list.add(5);
            System.out.println("List before remove:");
            printList(list);
            list.head = removeDuplicates(list.head);
            System.out.println("List after remove: ");
            printList(list);


        }

        public static Node removeDuplicates(Node head){

            Node current = head;
            while (current!= null && current.next!= null){
                if ( current.data == current.next.data){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
        public static void printList(MyLinkedList list){
            Node current = list.head;
            while (current.next!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }

