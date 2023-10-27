package hw3_22001665_CaoSyNguyenVu.ex3;

import java.util.Random;

public class Main {
    public static <T> void testGetData(SimpleLinkedList<T> list, int pos) {
        System.out.println("---------------------------------------");
        System.out.println("Element " + pos + ": " + list.get(pos));
    }

    public static <T> void testSetData(SimpleLinkedList<T> list, int pos, int data) {
        System.out.println("---------------------------------------");
        System.out.println("Set " + data + " at " + pos + ": ");
        System.out.println(list);
    }

    public static <T> void testAddTop(SimpleLinkedList<T> list, T data) {
        System.out.println("---------------------------------------");
        System.out.println("Add " + data + " at top: ");
        list.addTop(data);
        System.out.println(list);
    }

    public static <T> void testAddBot(SimpleLinkedList<T> list, T data) {
        System.out.println("---------------------------------------");
        System.out.println("Add " + data + " at bot: ");
        list.addBot(data);
        System.out.println(list);
    }

    public static <T> void testRemoveTop(SimpleLinkedList<T> list) {
        System.out.println("---------------------------------------");
        System.out.println("Remove first element: " + list.removeTop());
        System.out.println(list);
    }

    public static <T> void testRemoveBot(SimpleLinkedList<T> list) {
        System.out.println("---------------------------------------");
        System.out.println("Remove last element: " + list.removeBot());
        System.out.println(list);
    }

    public static <T> void testRemoveData(SimpleLinkedList<T> list, int data) {
        System.out.println("---------------------------------------");
        System.out.println("Remove " + data + ": ");
        System.out.println(list);
    }

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        Random random = new Random();
        int n = 30;
        for (int i = 0; i < n; i++) {
            list.addBot(random.nextInt(100));
        }
        System.out.println("List:\n" + list);
        testAddTop(list, random.nextInt(100));
        testAddBot(list, random.nextInt(100));
        testGetData(list, random.nextInt(n));
        testSetData(list, random.nextInt(n), random.nextInt(100));
        testRemoveTop(list);
        testRemoveBot(list);
        testRemoveData(list, random.nextInt(100));
    }
}
