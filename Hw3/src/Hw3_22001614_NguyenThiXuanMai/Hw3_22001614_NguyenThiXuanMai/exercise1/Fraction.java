package Hw3_22001614_NguyenThiXuanMai.exercise1;

import java.util.Scanner;

public class Fraction {
    private float numerator, denominator;

    public Fraction(float numerator, float denominator) {
        Scanner sc = new Scanner(System.in);
        while (denominator == 0) {
            System.out.println("Không tồn tại phân số với mẫu bằng 0. Mời nhập lại phân số hợp lệ: ");
            numerator = sc.nextFloat();
            denominator = sc.nextFloat();
        }

        this.numerator = (float) (Math.round(numerator * 1000) / 1000.0) * 1000;
        this.denominator = (float) (Math.round(denominator * 1000) / 1000.0) * 1000;
        normalize(this);
    }

    public Fraction add(Fraction c) {
        if (denominator == c.denominator) {
            return new Fraction(numerator + c.numerator, denominator);
        }
        return normalize(new Fraction(numerator * c.denominator + c.numerator * denominator, denominator * c.denominator));
    }

    public Fraction minus(Fraction c) {
        if (denominator == c.denominator) {
            return new Fraction(numerator - c.numerator, denominator);
        }
        return normalize(new Fraction(numerator * c.denominator - c.numerator * denominator, denominator * c.denominator));
    }

    public Fraction multi(Fraction c) {
        return normalize(new Fraction(numerator * c.numerator, denominator * c.denominator));
    }

    public Fraction divi(Fraction c) {
        if (c.numerator == 0) {
            throw new ArithmeticException();
        }
        return normalize(new Fraction(numerator * c.denominator, denominator * c.numerator));
    }

    public Fraction normalize(Fraction c) {
        long d = gcd((long) c.numerator,(long) c.denominator);
        c.numerator /= d;
        c.denominator /= d;
        return c;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    private int compare(Fraction another) {
        if (denominator == another.denominator) {
            return Float.compare(numerator, another.numerator);
        }
        return Float.compare(numerator * another.denominator, another.numerator * denominator);
    }

    public void compareFractions(Fraction another) {
        if (compare(another) == 0) {
            System.out.println("Bằng nhau");
        } else if (compare(another) > 0) {
            System.out.println("Lớn hơn");
        } else {
            System.out.println("Nhỏ hơn");
        }
    }

    @Override
    public String toString() {
        if (numerator == 0) return Integer.toString(0);
        if (denominator == 1) return Integer.toString((int) numerator);
        return (int) numerator + "/" + (int) denominator;
    }
}
