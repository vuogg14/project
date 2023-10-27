package Hw3_22001666_LeMinhVuong.ex5.ex_28;


public class LinkList_28 {
    class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insert(int x, int k) {
        if (k < 0 || k > size) {
            System.out.println("Err!");
            return;
        }
        Node tmpNode = new Node(x);
        if (k == 0) {
            tmpNode.next = head;
            head.previous = tmpNode;
            head = tmpNode;
        } else if (k == size) {
            tmpNode.previous = tail;
            tail.next = tmpNode;
            tail = tmpNode;
        } else {
            Node result = head;
            int index = 0;
            while (index < k - 1) {
                result = result.next;
                index++;
            }
            tmpNode.previous = result;
            tmpNode.next = result.next;
            result.next.previous = tmpNode;
            result.next = tmpNode;
        }
        size++;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
