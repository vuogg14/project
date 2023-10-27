package Hw3_22001666_LeMinhVuong.ex8;

public class LinkList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private int size = 0;

    public void add(int data){
        Node result = new Node(data);
        if(head == null){
            head = result;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = result;
        }
        size++;
    }

    public void printNthFromLast(int n){
        if(n < 0 || n > size){
            System.out.println("ERR!");
            return;
        }
        Node tmp = head;
        for(int i = 1; i < size - n + 1; i++ ){
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }
}
