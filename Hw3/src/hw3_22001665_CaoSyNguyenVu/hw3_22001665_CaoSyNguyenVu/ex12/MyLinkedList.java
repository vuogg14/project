package hw3_22001665_CaoSyNguyenVu.ex12;

public class MyLinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    public int size() {
        return size;
    }
    public Node deleteDuplicates(Node node){
        if(node == null) return null;
        if(node.next == null) return node;
        Node tmp = node;
        while(tmp != null && tmp.next != null){
            if(tmp.data == tmp.next.data){
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return node;
    }
    public Node getNode(){
        return head;
    }
    public void print(Node node){
        for(Node i = node; i != null; i = i.next){
            System.out.print(i.data+" ");
        }
        System.out.println();
    }
}
