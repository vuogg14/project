package hw1_22001665_CaoSyNguyenVu.ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num1 = s.nextInt();
        System.out.println("integer: "+num1);

        System.out.print("Enter a real number: ");
        double num2 = s.nextDouble();
        System.out.println("real number: "+num2);

        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);
        System.out.println("character: "+ch);

        System.out.print("Enter a boolean value: ");
        boolean bool = s.nextBoolean();
        System.out.println("boolean value: "+bool);

        System.out.print("Enter a string: ");
        String string = s.next();
        System.out.println("string: "+string);
    }
}
