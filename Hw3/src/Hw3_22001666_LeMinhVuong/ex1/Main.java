package Hw3_22001666_LeMinhVuong.ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1.23f, 111.1f);
        System.out.println(fraction);
        System.out.println(fraction.normalize(fraction));
        Fraction fraction1 = new Fraction(1.230f, 111.10f);
        fraction.equals(fraction1);

        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n : ");

        int n = in.nextInt();
        ArrayList<Fraction> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Fraction frac = new Fraction(Math.round(rd.nextFloat(100) * 1000.0) / 1000
                    , Math.round(rd.nextFloat(100) * 1000.0) / 1000);
            frac.normalize(frac);
            list.add(frac);
        }
        for (Fraction i : list) {
            System.out.print(i + "  ");
        }
        System.out.println();

        //Tính tổng
        Fraction total = new Fraction(0, 1);
        for(Fraction i : list){
            total = total.add(i);
        }
        System.out.println(total.normalize(total));
        //Tính hiệu
        Fraction difference = new Fraction(0,1);
        for(Fraction i : list){
            difference = difference.minus(i);
        }
        System.out.println(difference.normalize(difference));
        //Tính tích
        Fraction product = new Fraction(1,1);
        for(Fraction i : list){
            product = product.multi(i);
        }
        System.out.println(product.normalize(product));
        //Tính thương
        Fraction quotient = new Fraction(1,1);
        for(Fraction i : list){
            quotient = quotient.divi(i);
        }
        System.out.println(quotient.normalize(quotient));
    }
}