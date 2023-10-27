package Hw3_22001604_DoChiKien.exc7;

import Hw3_22001604_DoChiKien.exc3.SimpleLinkedList;

public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    public static void testCase() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.addBot(1);
        simpleLinkedList.addBot(2);
        simpleLinkedList.addBot(3);
        simpleLinkedList.addBot(4);
        simpleLinkedList.addBot(5);
        System.out.println(simpleLinkedList.size());
    }
}
