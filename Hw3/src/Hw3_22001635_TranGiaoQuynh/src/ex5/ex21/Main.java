package ex5.ex21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex21 ex21 = new Ex21();
        System.out.println("nhập size của mảng: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("nhập phần tử của mảng: ");
        while (count < n) {
            ex21.add(sc.nextInt());
            count++;
        }
        ex21.print();
    }
}
//Nhập vào một số nguyên n, tiếp theo là n số nguyên của một dãy số.
//Hãy cài đặt nó vào một danh sách liên kết đơn và in ra màn hình danh sách đó, sau mỗt phần tử có đúng một khoảng trắng.
