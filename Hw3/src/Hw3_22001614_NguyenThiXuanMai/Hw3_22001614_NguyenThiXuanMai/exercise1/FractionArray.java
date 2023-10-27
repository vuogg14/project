package Hw3_22001614_NguyenThiXuanMai.exercise1;

import java.util.Scanner;

public class FractionArray {
    private Fraction[] fractions;

    public FractionArray(Fraction[] fractions) {
        this.fractions = fractions;
    }

    public void init(int n) {
        if (n <= 0) {
            System.out.println("Mảng không có phần tử nào.");
            System.exit(0);
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("fractions[" + i + "] = ");
            float numerator = sc.nextFloat();
            float denominator = sc.nextFloat();
            fractions[i] = new Fraction(numerator, denominator);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Dãy phân số đã tạo sau tối giản là: ");
        for (Fraction fraction : fractions) {
            sb.append(fraction + " ");
        }
        return sb.toString();
    }

    public Fraction getIndex(int i) {
        if (i < 0 || i >= fractions.length) {
            throw new IndexOutOfBoundsException();
        }
        return fractions[i];
    }

    public Fraction add() {
        if (fractions.length == 1) {
            return fractions[0];
        }

        Fraction tmp = new Fraction(fractions[0].getNumerator(), fractions[0].getDenominator());
        for (int i = 1; i < fractions.length; i++) {
            tmp = tmp.add(fractions[i]);
        }
        return tmp;
    }

    public Fraction minus() {
        if (fractions.length == 1) {
            return fractions[0];
        }

        Fraction tmp = new Fraction(fractions[0].getNumerator(), fractions[0].getDenominator());
        for (int i = 1; i < fractions.length; i++) {
            tmp = tmp.minus(fractions[i]);
        }
        return tmp;
    }

    public Fraction multi() {
        if (fractions.length == 1) {
            return fractions[0];
        }

        Fraction tmp = new Fraction(fractions[0].getNumerator(), fractions[0].getDenominator());
        for (int i = 1; i < fractions.length; i++) {
            tmp = tmp.multi(fractions[i]);
        }
        return tmp;
    }

    public Fraction divi() {
        if (fractions.length == 1) {
            return fractions[0];
        }

        Fraction tmp = new Fraction(fractions[0].getNumerator(), fractions[0].getDenominator());
        for (int i = 1; i < fractions.length; i++) {
            tmp = tmp.divi(fractions[i]);
        }
        return tmp;
    }
}
