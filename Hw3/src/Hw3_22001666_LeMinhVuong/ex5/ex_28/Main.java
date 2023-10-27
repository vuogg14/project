package Hw3_22001666_LeMinhVuong.ex5.ex_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkList_28 list = new LinkList_28();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            list.add(number);
        }

        int k = in.nextInt();
        int x = in.nextInt();

        list.insert(x, k);
        list.print();
    }
}
