package hw1_19_NgoHaiYen.ex5;

import java.util.Scanner;

public class Project27_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator(sc);
    }

    public static void calculator(Scanner sc) {
        try {
            System.out.print("Nhap phep tinh: ");
            double n1 = sc.nextInt();
            String s = sc.next();
            double n2 = sc.nextInt();
            double result;
            switch (s) {
                case "+":
                    result = n1 + n2;
                    System.out.println(n1 + " " + s + " " + n2 + " = " + (double) Math.round(result * 100) / 100);
                    break;
                case "-":
                    result = n1 - n2;
                    System.out.println(n1 + " " + s + " " + n2 + " = " +(double) Math.round(result * 100) / 100);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println(n1 + " " + s + " " + n2 + " = " +(double) Math.round(result * 100) / 100);
                    break;
                case "/":
                    if (n2 == 0) {
                        System.out.println("Can't solve");
                    } else {
                        result = n1 / n2;
                        System.out.println(n1 + " " + s + " " + n2 + " = " +(double) Math.round(result * 100) / 100);
                    }
                    break;
                default:
                    System.out.println("Can't solve");
            }
        } catch (Exception e) {
            System.out.println("Gia tri khong hop le!");
        }
    }
}
