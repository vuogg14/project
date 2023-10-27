package hw3_22001665_CaoSyNguyenVu.ex9;

import java.util.Random;

public class Main {
    public static void solve(MyLinkedList list, Random random) {
        int data = random.nextInt(100);
        System.out.println("Frequency of " + data + " is " + list.count(data));
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("List: ");
        list.display();
        solve(list, random);
    }
}
