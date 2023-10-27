package hw1_22001665_CaoSyNguyenVu.ex_4;

public class Sphere {
    private double r = 1.0;
    private double x = 1.0;
    private double y = 1.0;
    private double z = 1.0;

    public Sphere(double r, double x, double y, double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double surroundingArea() {
        return 4 * Math.PI * r * r;
    }

    public double volume() {
        return 4 * Math.PI * r * r * r / 3;
    }

    public boolean isContact(Sphere other) {
        return distance(other) < (r + other.r) && distance(other) > Math.abs(r - other.r);
    }

    public boolean isContain(Sphere other) {
        return distance(other) < Math.abs(r - other.r);
    }

    private double distance(Sphere other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y) + (z - other.z) * (z - other.z));
    }

    public String toString() {
        return String.format("radius=%.2f (x,y,z)=(%.2f,%.2f,%.2f)", r, x, y, z);
    }
}
