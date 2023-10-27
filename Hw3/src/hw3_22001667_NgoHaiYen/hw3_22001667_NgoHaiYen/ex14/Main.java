package hw3_22001667_NgoHaiYen.ex14;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead(0);
        list.print();
        list.addToTail(2);
        list.print();
        list.add(1, 1);
        list.print();
        list.deleteAtHead();
        list.print();
        list.deleteAtTail();
        list.print();
    }
}
