package hw3_22001667_NgoHaiYen.ex6;

public class MyLinkedList {
    Node head;
    int size = 0;
    public MyLinkedList(){
        head = null;
    }
    public int get( int index ){
        if ( index < 0 || index >= size ){
            return -1;
        }
        Node current = head;
        for ( int i = 0; i < index; i++ ){
            current = current.next;
        }
        return current.val;
    }
    public void addAtHead(int val){
        Node newNode = new Node(val);
        if ( head != null ){
            newNode.next = head;
            head = newNode;
        } else {
            head = newNode;
        }
        size++;
    }
    public void addAtTail(int val){
        if ( head == null ){
            head = new Node(val);
        } else {
            Node temp = head;
            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = new Node(val);
        }
        size++;
    }
    public void addAtIndex(int index, int val){
        if ( index < 0 || index >= size){
            return;
        }
        if ( index == 0 ){
            addAtHead(val);
        } else {
            Node newNode = new Node(val);
            //Tim vi tri ma can them vao
            Node currNode = head;
            int count = 0;
            while ( currNode != null ){
                count++;
                if ( count == index ){
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        size++;
    }

    public void deleteAtIndex(int index){
        if ( index < 0 || index >= size ){
            return;
        }
        Node current = head;
        Node previous = null;
        for ( int i = 0; i < index ; i++ ){
            previous = current;
            current = current.next;
        }
        if ( previous == null ){
            head = head.next;
        } else {
            previous.next = current.next;
        }
        size--;
    }

}
