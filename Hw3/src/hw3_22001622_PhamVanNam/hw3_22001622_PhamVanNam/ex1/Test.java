package hw3_22001622_PhamVanNam.ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fraction[] fractions = new Fraction[n];
        for (int i = 0; i < n; i++) {
            fractions[i] = new Fraction(in.nextFloat(), in.nextFloat());
        }

        System.out.println("print element vth : ");
        System.out.println(fractions[in.nextInt()]);

        Fraction sum = fractions[0];
        for (int i = 1; i < n; i++) {
            sum = sum.add(fractions[i]);
        }
        System.out.println("sum : " + sum.normalize(sum));

        Fraction minus = fractions[0];
        for (int i = 1; i < n; i++) {
            minus = minus.minus(fractions[i]);
        }
        System.out.println("minus : " + minus.normalize(minus));

        Fraction multi = fractions[0];
        for (int i = 1; i < n; i++) {
            multi = multi.multi(fractions[i]);
        }
        System.out.println("multi : " + multi.normalize(multi));

        Fraction divi = fractions[0];
        for (int i = 1; i < n; i++) {
            divi = divi.divi(fractions[i]);
        }
        System.out.println("divi : " + divi.normalize(divi));

        //compare
        System.out.println("compare : ");
        System.out.println("input a :");
        Fraction a = new Fraction(in.nextFloat(), in.nextFloat());
        System.out.println("input b :");
        Fraction b = new Fraction(in.nextFloat(), in.nextFloat());
        System.out.println(a.compare(b));
    }
}
