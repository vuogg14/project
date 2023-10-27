package ex5.ex23;

import ex5.ex22.Ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Ex23 ex23 = new Ex23();
            System.out.println("nhập size của mảng: ");
            int n = sc.nextInt();
            int count = 0;
            System.out.println("nhập phần tử của mảng: ");
            while (count < n) {
                ex23.add(sc.nextInt());
                count++;
            }
            ex23.print();
            System.out.println("Vị trí phần tử mà bạn muốn xóa ");
            int i = sc.nextInt();
            System.out.println("Xóa phần tử thứ i:  ");
            ex23.remove(i);
            ex23.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn. Tiếp theo cho một số nguyên k, (0 ≤ k < n), hãy xóa phần tử ở chỉ số k và in ra màn hình danh sách đó, sau một phần tử có một khoảng trắng.
