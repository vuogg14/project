package hk1_22001665_CaoSyNguyenVu.polygon.project;

public class Octagon implements Polygon{
    private double[] edge;
    private double[] xPoints;
    private double[] yPoints;

    public Octagon(double[] edge) {
        this.edge = edge;
    }

    public Octagon(double[] xPoints, double[] yPoints) {
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
