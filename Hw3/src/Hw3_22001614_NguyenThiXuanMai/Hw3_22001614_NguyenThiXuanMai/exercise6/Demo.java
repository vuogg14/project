package Hw3_22001614_NguyenThiXuanMai.exercise6;

public class Demo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        // test addAtTail
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        myLinkedList.addAtTail(6);
        myLinkedList.print();

        // test addAtHead
        myLinkedList.addAtHead(0);
        myLinkedList.print();

        // test addAtIndex
        myLinkedList.addAtIndex(4, 100);
        myLinkedList.print();

        // test get
        System.out.println(myLinkedList.get(6));

        // test deleteAtIndex
        myLinkedList.deleteAtIndex(4);
        myLinkedList.print();
    }
}
