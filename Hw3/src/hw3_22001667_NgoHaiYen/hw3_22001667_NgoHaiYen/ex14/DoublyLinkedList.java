package hw3_22001667_NgoHaiYen.ex14;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            return;
        }
        Node newNode = new Node(data);
        if (index == 0) {
            addToHead(data);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current == null) {
                addToTail(data);
            } else {
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void deleteAtHead() {
        if (head == null) {
        } else if ( head.next == null ) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtTail() {
        if (head == null) {
        } else if (head.next == null) {
            head = null;
            tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            return;
        } else if (index == 0) {
            deleteAtHead();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
