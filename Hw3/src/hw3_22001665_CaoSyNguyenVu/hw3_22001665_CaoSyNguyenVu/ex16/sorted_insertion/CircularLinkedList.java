package hw3_22001665_CaoSyNguyenVu.ex16.sorted_insertion;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        size = 0;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            head.next = head;
            tail = head;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
            tail.next = head;
        }
        size++;
    }

    public Node getFirstNode() {
        return head;
    }
    public void setHead(Node head){
        this.head = head;
        Node crr = head;
        while(crr.next!=head){
            crr = crr.next;
        }
        tail = crr;
    }
}
