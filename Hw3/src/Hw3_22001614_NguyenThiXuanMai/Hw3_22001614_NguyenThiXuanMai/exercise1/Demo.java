package Hw3_22001614_NguyenThiXuanMai.exercise1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phân số muốn tạo: ");
        int n = sc.nextInt();
        Fraction[] fractions = new Fraction[n];
        FractionArray fractionArray = new FractionArray(fractions);
        fractionArray.init(n);
        System.out.println(fractionArray);

        //test getIndex
        System.out.println("Phần tử ở vị trí đầu tiên là: " + fractionArray.getIndex(0));

        //test add
        System.out.println("Cộng tất cả các phần tử của dãy phân số đã tạo: " + fractionArray.add());

        //test minus
        System.out.println("Lấy phần tử đầu trừ đi các phần tử còn lại có trong dãy: " + fractionArray.minus());

        //test multiply
        System.out.println("Nhân tất cả các phần tử của dãy: " + fractionArray.multi());

        //test divi
        System.out.println("Lấy phần tử đầu chia cho lần lượt các phần tử còn lại trong mảng: " + fractionArray.divi());

        //bài tập đề xuất thêm: so sánh hai phân số
        System.out.print("So sánh hai phân số 1/2 và 1/3: ");
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(1, 3);
        fraction.compareFractions(fraction1);
    }
}
