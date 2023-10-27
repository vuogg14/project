package ex8;

import ex5.ex22.Ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Ex8 ex8 = new Ex8();
            System.out.println("nhập size của mảng: ");
            int n = sc.nextInt();
            int count = 0;
            System.out.println("nhập phần tử của mảng: ");
            while (count < n) {
                ex8.add(sc.nextInt());
                count++;
            }
            ex8.print();
            System.out.println("Phần tử thứ N từ cuối bạn muốn là ");
            int i = sc.nextInt();
            System.out.println("Phần tử thứ N từ cuối của linked list là:  " + ex8.get(ex8.size()-i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
