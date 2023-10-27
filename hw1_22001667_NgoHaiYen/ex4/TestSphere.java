package hw1_19_NgoHaiYen.ex4;

public class TestSphere {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(2,1,1,1);
        Sphere s2 = new Sphere(3,1,1,1);
        System.out.println("Sphere 1: "+s1);
        System.out.println("Area: "+s1.getArea());
        System.out.println("Volume: "+s1.getVolume());
        System.out.println("Sphere 2: "+s2);
        System.out.println("Is intersect: "+ s1.isIntersect(s2));
        System.out.println("Is surround: "+s1.isSurround(s2));
        System.out.println("Have the same center: "+s1.sameCenter(s2));
    }
}
