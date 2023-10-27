package hw3_22001665_CaoSyNguyenVu.ex5.codelearn28;

import java.util.Scanner;

public class Main {
    public static void solve(DoublyLinkedList list, int k, int x) {
        list.addAt(k, x);
        list.display();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.addTail(s.nextInt());
        }
        int k = s.nextInt();
        int x = s.nextInt();
        solve(list, k, x);
    }
}
