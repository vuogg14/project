package hw3_22001665_CaoSyNguyenVu.ex1;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(4.2f, 3.78f);
        System.out.println("fraction 1: " + fraction1);

        Fraction fraction2 = new Fraction(3.6f, 6.48f);
        System.out.println("fraction 2: " + fraction2);

        System.out.println("Check calculation: ");
        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.minus(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multi(fraction2));
        System.out.println(fraction1 + " : " + fraction2 + " = " + fraction1.divide(fraction2));

    }
}
