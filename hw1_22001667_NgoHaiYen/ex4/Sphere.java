package hw1_19_NgoHaiYen.ex4;

public class Sphere {
    private int radius;

    private MyPoint center;
    public Sphere(int radius, int x, int y, int z){
        this.radius = radius;
        this.center = new MyPoint(x,y,z);
    }

    public Sphere(int radius, MyPoint center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getArea(){
        return (double) Math.round(Math.PI*radius*radius*4*100)/100;
    }

    public double getVolume(){
        return (double) Math.round(Math.PI*Math.pow(radius,3)*4/3*100)/100;
    }

    public boolean isIntersect(Sphere another){
        //Kiểm tra hai hình cầu có giao nhau không
        return Math.abs(radius - another.radius) <= center.distance(another.center) &&
                center.distance(another.center) <= radius + another.radius;
    }
    public boolean isInternalExposure(Sphere anothor){
        // Kiem tra hai hinh cau co tiep xuc trong khong
        return center.distance(anothor.center) == Math.abs(radius-anothor.radius);
    }

    public boolean isExternalContact(Sphere anothor){
        //Kiem tra hai hinh cau co tiep xuc ngoai khong
        return center.distance(anothor.center) == radius + anothor.radius;
    }
    public boolean sameCenter(Sphere another){
        return center.getX() == another.center.getX() && center.getY() == another.center.getY()
                && center.getZ() == another.center.getZ();
    }

    public boolean isSurround(Sphere another){
        //Kiểm tra hai hình cầu có bao nhau không
        return center.distance(another.center) <= Math.abs(radius-another.radius);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
