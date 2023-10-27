package hw3_22001665_CaoSyNguyenVu.ex14.insert_sorted_list;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++) {
            list.addSortedInsert(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();
    }
}
