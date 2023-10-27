package hw1_19_NgoHaiYen.ex4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double distance( MyPoint another ){
        return (double) Math.round(Math.sqrt(Math.sqrt((x - another.x)
                * (x - another.x) + (y - another.y) * (y - another.y)
                * (z - another.z)*(z - another.z)))*100)/100;
    }

    @Override
    public String toString() {
        return "[" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }
}
