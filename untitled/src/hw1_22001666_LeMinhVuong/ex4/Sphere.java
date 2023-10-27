package hw1_22001666_LeMinhVuong.ex4;

public class Sphere {
    private double radius;
    private double x;
    private double y;
    private double z;

    public Sphere(double radix, double x, double y, double z) {
        this.radius = radix;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Sphere[radix= " + radius + ", (" + x + "," + y + "," + z + ") ]";
    }

    public double surroundingArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double volume(){
        return 4 / 3 * Math.PI * radius * radius * radius;
    }

    private double distanceCenter(Sphere another){
        return Math.sqrt((x - another.x) * (x - another.x)
                + (y - another.y) * (y - another.y)
                + (z - another.z) * (z - another.z));
    }

    public boolean isInside(Sphere another){
        double distance = this.distanceCenter(another);
        return distance + another.radius <= radius;
    }

    public void check(Sphere another){
        double distance = this.distanceCenter(another);
        if(distance + another.radius < radius){
            System.out.println("Hai hình cầu bao nhau");
        } else if (distance + another.radius == radius){
            System.out.println("Hai hình cầu tiếp xúc trong");
        } else if (distance < radius + another.radius) {
            System.out.println("Hai hình cầu giao nhau ");
        } else if (distance == radius + another.radius) {
            System.out.println("Hai hình cầu tiếp xúc ngoài");
        } else if (distance > radius + another.radius) {
            System.out.println("Ngoài nhau");
        }
    }

    public boolean isIntersect(Sphere another){
        double distance = this.distanceCenter(another);
        return distance < radius + another.radius;
    }
}
