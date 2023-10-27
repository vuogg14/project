package ex1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap size cua mang: ");
            int size = sc.nextInt();
            System.out.println("nhap phan tu cua mang: ");
            Fraction[] fractions = new Fraction[size];
            for (int i = 0; i < size; i++) {
                System.out.println("phan tu thu " + (i+1) + "la: ");
                fractions[i] = new Fraction(sc.nextFloat(),sc.nextFloat());
            }
            ArrayFraction arrayFraction = new ArrayFraction(fractions);
            System.out.println("mang vua nhap la: " );
            arrayFraction.print();
            System.out.println("test add: " + arrayFraction.addMultiple());
            System.out.println("test minus: " + arrayFraction.minusMultiple());
            System.out.println("test multi: " + arrayFraction.multiple());
            System.out.println("test divide: " + arrayFraction.divideMultiple());
            System.out.println("test sort: ");
            arrayFraction.sortArr();
            arrayFraction.print();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
