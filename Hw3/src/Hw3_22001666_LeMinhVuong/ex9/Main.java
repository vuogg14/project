package Hw3_22001666_LeMinhVuong.ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        list.add(2);
        System.out.println(list.count(n));
    }
}
