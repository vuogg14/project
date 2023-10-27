package hw3_22001665_CaoSyNguyenVu.ex6;

import java.util.Random;

public class Main {
    public static void testAddAtHead(MyLinkedList list, Random random) {
        System.out.println("\n------------------------------------------------");
        int n = random.nextInt(100);
        System.out.println("Add " + n + " add head: ");
        list.addAtHead(n);
        list.display();
    }

    public static void testAddTail(MyLinkedList list, Random random) {
        System.out.println("\n------------------------------------------------");
        int n = random.nextInt(100);
        System.out.println("Add " + n + " add tail: ");
        list.addAtTail(n);
        list.display();
    }

    public static void testAddAtIndex(MyLinkedList list, Random random) {
        System.out.println("\n------------------------------------------------");
        int pos = random.nextInt(list.size() + 1);
        int n = random.nextInt(100);
        System.out.println("Add " + n + " at " + pos + " position: ");
        list.addAtIndex(pos, n);
        list.display();
    }

    public static void testDeleteAtIndex(MyLinkedList list, Random random) {
        System.out.println("\n------------------------------------------------");
        int pos = random.nextInt(list.size());
        System.out.println("Remove data at " + pos + " position: ");
        list.deleteAtIndex(pos);
        list.display();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++){
            list.addAtTail(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();
        testAddAtHead(list, random);
        testAddTail(list, random);
        testAddAtIndex(list, random);
        testDeleteAtIndex(list, random);
    }
}
