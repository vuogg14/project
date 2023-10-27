package hw1_22001666_LeMinhVuong.ex4;

public class Main {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(5.0, 0, 0, 0);
        Sphere sphere2 = new Sphere( 4.0, 8, 0, 0);

        System.out.println(sphere1);
        System.out.println(sphere2);
        sphere1.check(sphere2);

    }
}
