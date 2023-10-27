package hw3_22001665_CaoSyNguyenVu.ex16.is_circle;

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
}
