package hw3_22001665_CaoSyNguyenVu.ex8;

import java.util.Random;

public class Main {
    public static void solve(MyLinkedList list, Random random, int bounds) {
        int n = random.nextInt(bounds);
        System.out.println("Value at " + n + " pos from last to first: " + list.getNthFromLast(n));
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();
        solve(list, random, n);
    }
}
