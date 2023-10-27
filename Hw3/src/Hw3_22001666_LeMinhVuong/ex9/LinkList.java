package Hw3_22001666_LeMinhVuong.ex9;

public class LinkList {
    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private int size = 0;

    public void add(int data){
        Node current = new Node(data);
        if(head == null){
            head = current;
        } else {
            Node newCurrent = head;
            while (newCurrent.next != null){
                newCurrent = newCurrent.next;
            }
            newCurrent.next = current;
        }
        size++;
    }

    public int count(int data){
        Node current = head;
        int count = 0;
        while (current != null){
            if(current.data == data){
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
