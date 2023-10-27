package Hw3_22001604_DoChiKien.exc5.problem28;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        testDoublyLinkedList(scanner);
    }

    public static void testDoublyLinkedList(Scanner scanner) throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if (n < 1) {
            throw new Exception("Invalid input!");
        }
        for (int idx = 0; idx < n; idx++) {
            int nodeVal = scanner.nextInt();
            if (nodeVal < 0) {
                throw new Exception("Invalid input!");
            }
            doublyLinkedList.add(nodeVal);
        }
        System.out.print("Enter index k: ");
        int k = scanner.nextInt();
        if (k < 0 || k > doublyLinkedList.size()) {
            throw new Exception("Index out of bound!");
        }
        System.out.print("Enter value x: ");
        int x = scanner.nextInt();
        doublyLinkedList.insert(k, x);
        System.out.println(doublyLinkedList);
    }
}
