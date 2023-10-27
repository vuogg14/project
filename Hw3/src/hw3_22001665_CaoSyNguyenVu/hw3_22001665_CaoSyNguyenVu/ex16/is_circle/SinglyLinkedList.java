package hw3_22001665_CaoSyNguyenVu.ex16.is_circle;


public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        size = 0;
    }
    public void add(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
        } else {
            tail.next = new Node(data);
            tail=tail.next;
        }
    }
    public Node getFirstNode(){
        return head;
    }
}
