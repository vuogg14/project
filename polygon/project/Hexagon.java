package hk1_22001665_CaoSyNguyenVu.polygon.project;

public class Hexagon implements Polygon{
    private double[] edge;
    private double[] xPoints;
    private double[] yPoints;

    public Hexagon(double[] edge) {
        this.edge = edge;
    }

    public Hexagon(double[] xPoints, double[] yPoints) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
