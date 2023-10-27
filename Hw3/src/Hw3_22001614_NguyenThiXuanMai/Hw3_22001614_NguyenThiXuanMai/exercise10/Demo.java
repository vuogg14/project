package Hw3_22001614_NguyenThiXuanMai.exercise10;

public class Demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList();
        linkedList.print();

        // test reverse
        linkedList.reverse();
        linkedList.print();
    }
}
