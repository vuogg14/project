package hw3_22001665_CaoSyNguyenVu.ex5.codelearn29;

import java.util.Scanner;

public class Main {
    public static void solve(DoublyLinkedList list, int pos) {
        list.removeAt(pos);
        list.display();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            list.addTail(s.nextInt());
        }
        int pos = s.nextInt();
        solve(list, pos);
    }
}
