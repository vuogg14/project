package hw1_22001665_CaoSyNguyenVu.ex_4;

import java.util.Scanner;

public class Main {
    public static Sphere createSphere(Scanner s) {
        System.out.println("Create a new sphere: ");

        System.out.print("Enter radius: ");
        double r = s.nextDouble();
        System.out.print("Enter x position: ");
        double x = s.nextDouble();
        System.out.print("Enter y position: ");
        double y = s.nextDouble();
        System.out.print("Enter z position: ");
        double z = s.nextDouble();

        return new Sphere(r, x, y, z);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Create sphere 1: ");
        Sphere sphere1 = createSphere(s);
        System.out.println(sphere1);
        System.out.println("Surface Area: "+sphere1.surroundingArea());
        System.out.println("Volume: "+sphere1.volume());
        System.out.println("-------------------------------");

        System.out.println("Create sphere 2: ");
        Sphere sphere2 = createSphere(s);
        System.out.println(sphere2);
        System.out.println(sphere1);
        System.out.println("Check contact");
        if(sphere1.isContact(sphere2)){
            System.out.println("Two spheres intersect");
        } else {
            System.out.println("Two spheres do not intersect");
        }

        System.out.println("Check contain");
        if(sphere1.isContain(sphere2)){
            System.out.println("One of the two spheres contains the other");
        } else {
            System.out.println("neither sphere contains the other");
        }
    }
}
