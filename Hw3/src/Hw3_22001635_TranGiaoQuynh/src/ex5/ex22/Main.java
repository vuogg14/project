package ex5.ex22;

import ex5.ex21.Ex21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Ex22 ex22 = new Ex22();
            System.out.println("nhập size của mảng: ");
            int n = sc.nextInt();
            int count = 0;
            System.out.println("nhập phần tử của mảng: ");
            while (count < n) {
                ex22.add(sc.nextInt());
                count++;
            }
            ex22.print();
            System.out.println("Nhập vị trí mà bạn muốn lấy: ");
            int i = sc.nextInt();
            System.out.println("Phần tử thứ i mà bạn muốn lấy là:  " + ex22.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn, tiếp theo nhập số nguyên k (0 ≤ k < n).
//Hãy đưa ra giá trị phần tử ở chỉ số k.
