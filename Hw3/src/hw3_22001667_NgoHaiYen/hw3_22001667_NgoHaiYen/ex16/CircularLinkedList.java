package hw3_22001667_NgoHaiYen.ex16;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void printList() {
        Node current = head;
        for ( int i = 0; i < size; i++){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void add(int data){
        Node newNode = new Node(data);
        if ( head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void insert(int index, int data){
        if ( index < 0 || index > size){
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for ( int i = 0; i < index-1; i++ ){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    public void addToIncreaseList(int data){
        Node newNode = new Node(data);
        Node current = head;
        for ( int i = 0; i < size; i++ ){
            if ( current.data <= data && current.next.data >= data){
                insert(i+1, data);
                break;
            } else {
                current = current.next;
            }
        }
    }

}
