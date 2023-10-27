package Hw3_22001604_DoChiKien.exc6;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    public static void testCase() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(0);
        linkedList.addAtIndex(1, 4);
        linkedList.addAtTail(8);
        linkedList.addAtHead(5);
        linkedList.addAtIndex(4, 3);
        linkedList.addAtTail(0);
        linkedList.addAtTail(5);
        linkedList.addAtIndex(6, 3);
        linkedList.deleteAtIndex(7);
        linkedList.deleteAtIndex(5);
        linkedList.addAtTail(4);
        System.out.println(linkedList);
    }
}
