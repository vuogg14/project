package hw3_22001665_CaoSyNguyenVu.ex14.delete_node;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < 20; i++) {
            list.addTail(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();

        int pos = random.nextInt(n);
        System.out.println("Delete data at " + pos + " position:");
        list.deleteNode(pos);
        list.display();
    }
}
