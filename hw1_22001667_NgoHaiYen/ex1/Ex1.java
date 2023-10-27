package hw1_19_NgoHaiYen.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri so nguyen: ");
        int n = sc.nextInt();
        System.out.println("Integer: " + n);
        System.out.print("Nhap vao mot chuoi cac ki tu: ");
        String s = sc.next();
        System.out.println("String: " + s);
        System.out.print("Nhap vao mot so thuc: ");
        double d = sc.nextDouble();
        System.out.println("Double: " + d);
        System.out.print("Nhap vao True hoac False: ");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean: " + b);

    }
}
