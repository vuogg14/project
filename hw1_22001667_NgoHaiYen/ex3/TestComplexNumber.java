package hw1_19_NgoHaiYen.ex3;

import java.util.Scanner;

public class TestComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so phuc thu nhat:");
        ComplexNumber a = new ComplexNumber(sc.nextDouble(), sc.nextDouble());

        System.out.println("Nhap so phuc thu hai: ");
        ComplexNumber b = new ComplexNumber(sc.nextDouble(),sc.nextDouble());

        System.out.println("Tong la: " + a.add(b).toString());
        System.out.println("Hieu la: " + a.subtract(b).toString());
        System.out.println("Tich la: " + a.mutiplly(b).toString());
        System.out.println("Thuong la: " + a.divide(b).toString());

        System.out.println("Nhap so phuc thu ba: ");
        ComplexNumber c = new ComplexNumber(sc.nextDouble(), sc.nextDouble());
        System.out.println("Tong ba so phuc la: "+a.add(b).add(c));
        System.out.println("Tich ba so phuc la: "+ a.mutiplly(b).mutiplly(c));

    }
}
