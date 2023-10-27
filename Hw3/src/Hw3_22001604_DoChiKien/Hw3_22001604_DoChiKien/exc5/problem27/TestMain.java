package Hw3_22001604_DoChiKien.exc5.problem27;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        testCase(scanner);
    }

    public static void testCase(Scanner scanner) throws Exception {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLinkedList(n);
        System.out.println(doublyLinkedList);
    }
}
