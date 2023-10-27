package hw3_22001665_CaoSyNguyenVu.ex17;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Random random = new Random();
        int n = 21;
        for(int i = 0; i<n; i++){
            list.add(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display(list.getHead());

        System.out.println("After splitting: ");
        list.splitList(list);
        System.out.println("List1: ");
        list.display(list.getHead1());
        System.out.println("List2: ");
        list.display(list.getHead2());
    }
}
