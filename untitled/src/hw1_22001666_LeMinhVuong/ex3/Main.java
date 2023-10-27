package hw1_22001666_LeMinhVuong.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập phần thực và phần ảo");
        double real1 = in.nextDouble();
        double img1 = in.nextDouble();
        Complex complex1 = new Complex(real1, img1);

        System.out.println("Nhập phần thực và phần ảo");
        double real2 = in.nextDouble();
        double img2 = in.nextDouble();
        Complex complex2 = new Complex(real2, img2);

        Complex complex3 = new Complex(2, -2);
        ArrayList<Complex> lists = new ArrayList<>();
        lists.add(complex1);
        lists.add(complex2);
        lists.add(complex3);

        System.out.println("Tổng hai số phức: " + complex1.addComplex(complex2));
        System.out.println("Tích hai số phức " + complex1.mulComplex(complex2));

        Complex total = new Complex(0, 0);
        Complex product = new Complex(1,1);
        for(Complex i : lists){
            total = total.addComplex(i);
            product = product.mulComplex(i);
        }
        System.out.println("Tổng của các số phức trong mảng là: " + total);
        System.out.println("Tích của các số phức trong mảng là:" + product);
    }
}
