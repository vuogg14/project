package hk1_22001665_CaoSyNguyenVu.polygon.project;

public class Pentagon implements Polygon{
    private double[] edge;
    private double[] xPoints;
    private double[] yPoints;

    public Pentagon(double[] edge) {
        this.edge = edge;
    }

    public Pentagon(double[] xPoints, double[] yPoints) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            double edgeCD = Math.sqrt((xPoints[3] - xPoints[2]) * (xPoints[3] - xPoints[2])
                    + (yPoints[3] - yPoints[2]) * (yPoints[3] - yPoints[2]));
            double edgeDE = Math.sqrt((xPoints[3] - xPoints[4]) * (xPoints[3] - xPoints[4])
                    + (yPoints[3] - yPoints[4]) * (yPoints[3] - yPoints[4]));
            double edgeAE = Math.sqrt((xPoints[0] - xPoints[4]) * (xPoints[0] - xPoints[4])
                    + (yPoints[0] - yPoints[4]) * (yPoints[0] - yPoints[4]));
            return edgeAE + edgeAB + edgeBC + edgeCD + edgeDE;
        }
        return edge[0] + edge[1] + edge[2] + edge[3] + edge[4];
    }

    private boolean isPentagon(){

    }
}
