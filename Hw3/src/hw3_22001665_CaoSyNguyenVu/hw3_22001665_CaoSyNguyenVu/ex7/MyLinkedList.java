package hw3_22001665_CaoSyNguyenVu.ex7;

public class MyLinkedList {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList(){
        size = 0;
    }
    public void add(int data){
        Node tmp = new Node();
        tmp.data = data;
        if(head == null){
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }
    public Node getNode(){
        return head;
    }
    public int size(){
        return size;
    }
}
