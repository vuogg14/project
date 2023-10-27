package hw1_22001604_DoChiKien.exc4;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCase(scanner);
    }

    public static void testCase(Scanner scanner) {
        System.out.print("Enter x of the 1 sphere: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y of the 1 sphere: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter z of the 1 sphere: ");
        double z1 = scanner.nextDouble();
        System.out.print("Enter the radius of the 1 sphere: ");
        double r1 = scanner.nextDouble();
        Sphere sphere1 = new Sphere(r1, x1, y1, z1);
        System.out.println("Area of the 1 sphere: " + sphere1.getArea());
        System.out.println("Volume of the 1 sphere: " + sphere1.getVolume());
        System.out.println();

        System.out.print("Enter x of the 2 sphere: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y of the 2 sphere: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter z of the 2 sphere: ");
        double z2 = scanner.nextDouble();
        System.out.print("Enter the radius of the 2 sphere: ");
        double r2 = scanner.nextDouble();
        Sphere sphere2 = new Sphere(r2, x2, y2, z2);
        System.out.println("Area of the 2 sphere: " + sphere2.getArea());
        System.out.println("Volume of the 2 sphere: " + sphere2.getVolume());
        System.out.println();

        System.out.print("Relative position between 2 sphere: ");
        sphere1.relativePosition(sphere2);
    }
}

