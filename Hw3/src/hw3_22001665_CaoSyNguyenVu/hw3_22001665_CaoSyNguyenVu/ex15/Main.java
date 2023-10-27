package hw3_22001665_CaoSyNguyenVu.ex15;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++) {
            list.addTail(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();

        int time = random.nextInt(n);
        System.out.println("List after rotating " + time + " times: ");
        list.rotate(time);
        list.display();
    }
}
