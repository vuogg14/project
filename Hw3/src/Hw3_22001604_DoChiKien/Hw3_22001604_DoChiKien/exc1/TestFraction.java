package Hw3_22001604_DoChiKien.exc1;

import java.util.Scanner;

public class TestFraction {
    private Fraction[] fractions;
    private int n;

    public void testCase(Scanner scanner) throws Exception {
        populate(scanner);
        System.out.print("Enter index v: ");
        int v = scanner.nextInt();
        if (v >= n || v < 0) {
            throw new Exception("Index out of bound!");
        }
        System.out.println("Fraction at index v: " + fractions[v]);
        System.out.println("Sum of all fractions: " + sumOfFractions());
        System.out.println("Subtraction of all fraction: " + subtractionOfFractions());
        System.out.println("Multiplication of all fractions: " + multiplicationOfFractions());
        System.out.println("Division off all fraction: " + divisionOfFractions());
        System.out.println("The smallest fraction: " + findSmallestFraction());
    }

    public void populate(Scanner scanner) throws Exception {
        System.out.print("Enter the number of fraction: ");
        n = scanner.nextInt();
        if (n < 1) {
            throw new Exception("Invalid Input!");
        }
        fractions = new Fraction[n];
        float numerator, denominator;
        for (int idx = 0; idx < n; idx++) {
            System.out.print("Enter the numerator of the " + (idx + 1) + " fraction: ");
            numerator = scanner.nextFloat();
            System.out.print("Enter the denominator of the " + (idx + 1) + " fraction: ");
            denominator = scanner.nextFloat();
            if (Float.compare(denominator, 0) == 0) {
                throw new Exception("Invalid Input!");
            }
            fractions[idx] = new Fraction(numerator, denominator);
        }
    }

    public Fraction sumOfFractions() {
        Fraction ans = fractions[0];
        for (int idx = 1; idx < n; idx++) {
            ans = ans.add(fractions[idx]);
        }
        return ans;
    }

    public Fraction subtractionOfFractions() {
        Fraction ans = fractions[0];
        for (int idx = 1; idx < n; idx++) {
            ans = ans.minus(fractions[idx]);
        }
        return ans;
    }

    public Fraction multiplicationOfFractions() {
        Fraction ans = fractions[0];
        for (int idx = 1; idx < n; idx++) {
            ans = ans.multi(fractions[idx]);
        }
        return ans;
    }

    public Fraction divisionOfFractions() {
        Fraction ans = fractions[0];
        for (int idx = 1; idx < n; idx++) {
            ans = ans.divi(fractions[idx]);
        }
        return ans;
    }

    public Fraction findSmallestFraction() {
        Fraction ans = fractions[0];
        for (int idx = 1; idx < n; idx++) {
            if (Float.compare(fractions[idx].getNumerator() / fractions[idx].getDenominator(), ans.getNumerator() / ans.getDenominator()) <= 0) {
                ans = fractions[idx];
            }
        }
        return ans;
    }
}
