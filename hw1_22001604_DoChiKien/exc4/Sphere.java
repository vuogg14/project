package hw1_22001604_DoChiKien.exc4;

class Sphere {
    private double radius;
    private double x;
    private double y;
    private double z;

    public Sphere(double r, double x, double y, double z) {
        this.radius = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public void relativePosition(Sphere sphere2) {
        double distance = distance(sphere2);
        if (distance + sphere2.getRadius() < this.radius || distance + this.radius < sphere2.getRadius()) {
            System.out.println("contains");
        } else if (this.radius == sphere2.getRadius() && this.x == sphere2.getX() && this.y == sphere2.getY() && this.z == sphere2.getZ()) {
            System.out.println("coincide");
        } else if (Double.compare(distance, this.radius - sphere2.getRadius()) == 0 || Double.compare(distance, sphere2.getRadius() - this.radius) == 0) {
            System.out.println("inner contact");
        } else if (Double.compare(distance, this.radius + sphere2.getRadius()) == 0) {
            System.out.println("outer contact");
        } else if (this.radius + sphere2.getRadius() > distance) {
            System.out.println("intersects");
        } else {
            System.out.println("there are no connection between this 2 sphere");
        }
    }

    public double distance(Sphere sphere2) {
        return Math.sqrt(Math.pow(this.x - sphere2.getX(), 2) + Math.pow(this.y - sphere2.getY(), 2) + Math.pow(this.z - sphere2.getZ(), 2));
    }
}
