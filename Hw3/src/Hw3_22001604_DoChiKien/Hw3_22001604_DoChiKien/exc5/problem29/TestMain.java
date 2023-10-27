package Hw3_22001604_DoChiKien.exc5.problem29;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        testCase(scanner);
    }

    public static void testCase(Scanner scanner) throws Exception {
        LinkedList linkedList = new LinkedList();
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
            linkedList.add(nodeVal);
        }
        System.out.print("Enter index k: ");
        int k = scanner.nextInt();
        linkedList.remove(k);
        System.out.println(linkedList);
    }
}
