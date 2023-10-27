package hw3_22001665_CaoSyNguyenVu.ex14.add_node;

public class MyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addHead(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.next = head;
            head.prev = tmp;
            head = tmp;
        }
        size++;
    }
    public void addTail(int data){
        Node tmp = new Node();
        tmp.data = data;
        if(head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.prev = tail;
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    /**
     * Given a doubly-linked list, a position p, and an integer x.
     * The task is to add a new node with value x at the position just after pth node in the doubly linked list.
     */

    public void addNode(int pos, int data) {
        if(pos == size-1){
            addTail(data);
        }
        else if (pos >= 0 && pos < size - 1) {
            Node crr = head;
            for(int i = 0; i<pos; i++){
                crr = crr.next;
            }
            Node tmp = new Node();
            tmp.data = data;

            tmp.next = crr.next;
            crr.next.prev = tmp;
            crr.next = tmp;
            tmp.prev = crr;
            size++;
        }
    }
    public void display(){
        for(Node node = head; node != null; node = node.next){
            System.out.print(node.data+" ");
        }
    }
}
