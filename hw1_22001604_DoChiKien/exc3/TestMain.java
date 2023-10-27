package hw1_22001604_DoChiKien.exc3;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCase1(scanner);
        testCase2(scanner);
        testCase3(scanner);
    }

    public static void testCase1(Scanner scanner) {
        System.out.println("Frist test");
        System.out.print("Enter the real part of the complex number: ");
        double real = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the complex number: ");
        double img = scanner.nextDouble();
        System.out.println(new ComplexNumber(real, img));
    }

    public static void testCase2(Scanner scanner) {
        System.out.println("Second test");
        System.out.print("Enter the real part of the 1 complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of 1 the complex number: ");
        double img1 = scanner.nextDouble();
        ComplexNumber cNum1 = new ComplexNumber(real1, img1);

        System.out.print("Enter the real part of the 2 complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of 2 the complex number: ");
        double img2 = scanner.nextDouble();
        ComplexNumber cNum2 = new ComplexNumber(real2, img2);
        System.out.println("Sum of 2 complex number = " + sumOf2ComplexNumber(cNum1, cNum2));
        System.out.println("Multiplication of 2 complex number = " + multiplyOf2ComplexNumber(cNum1, cNum2));
    }

    public static void testCase3(Scanner scanner) {
        System.out.println("Third test");
        System.out.print("Enter the number of complex number you want to calculate: ");
        int n = scanner.nextInt();
        ComplexNumber[] complexNumbers = new ComplexNumber[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the real part of the " + (i + 1) + " complex number: ");
            double real = scanner.nextDouble();
            System.out.print("Entyer the imaginary part of the " + (i + 1) + " complex number: ");
            double img = scanner.nextDouble();
            complexNumbers[i] = new ComplexNumber(real, img);
        }
        System.out.println("Sum of all complex number = " + sumOfComplexNums(complexNumbers));
        System.out.println("Multiplication of all complex number = " + multiplyOfComplexNums(complexNumbers));
    }

    public static ComplexNumber sumOf2ComplexNumber(ComplexNumber cNum1, ComplexNumber cNum2) {
        return new ComplexNumber(cNum1.getReal() + cNum2.getReal(), cNum1.getImg() + cNum2.getImg());
    }

    public static ComplexNumber multiplyOf2ComplexNumber(ComplexNumber cNum1, ComplexNumber cNum2) {
        double real = cNum1.getReal() * cNum2.getReal() - cNum1.getImg() * cNum2.getImg();
        double img = cNum1.getReal() * cNum2.getImg() + cNum1.getImg() * cNum2.getReal();
        return new ComplexNumber(real, img);
    }

    public static ComplexNumber sumOfComplexNums(ComplexNumber[] complexNumbers) {
        double real = 0;
        double img = 0;
        for (ComplexNumber cNum : complexNumbers) {
            real += cNum.getReal();
            img += cNum.getImg();
        }
        return new ComplexNumber(real, img);
    }

    public static ComplexNumber multiplyOfComplexNums(ComplexNumber[] complexNumbers) {
        double real = complexNumbers[0].getReal();
        double img = complexNumbers[0].getImg();
        for (int idx = 1; idx < complexNumbers.length; idx++) {
            ComplexNumber temp = multiplyOf2ComplexNumber(new ComplexNumber(real, img), complexNumbers[idx]);
            real = temp.getReal();
            img = temp.getImg();
        }
        return new ComplexNumber(real, img);
    }
}

