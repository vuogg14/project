package hk1_22001665_CaoSyNguyenVu.polygon.project;

public class Triangle implements Polygon {
    private double[] edge;
    private double[] xPoints;
    private double[] yPoints;

    public Triangle(double[] edge) {
        this.edge = edge;
    }

    public Triangle(double[] xPoints, double[] yPoints) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAC = Math.sqrt((xPoints[0] - xPoints[2]) * (xPoints[0] - xPoints[2])
                    + (yPoints[0] - yPoints[2]) * (yPoints[0] - yPoints[2]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            return Math.sqrt(halfPerimeter * (halfPerimeter - edgeAB)
                    * (halfPerimeter - edgeAC)
                    * (halfPerimeter - edgeBC));
        }
        return Math.sqrt(halfPerimeter * (halfPerimeter - edge[0])
                * (halfPerimeter - edge[1])
                * (halfPerimeter - edge[2]));
    }

    @Override
    public double perimeter() {
        if (!isTriangle()){
            return -1;
        }
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAC = Math.sqrt((xPoints[0] - xPoints[2]) * (xPoints[0] - xPoints[2])
                    + (yPoints[0] - yPoints[2]) * (yPoints[0] - yPoints[2]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            return edgeAC + edgeAB + edgeBC;
        }
        return edge[0] + edge[1] + edge[2];
    }

    private boolean isTriangle(){
        if(edge.length != 3 || xPoints.length != 3 || yPoints.length != 3){
            return false;
        }
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAC = Math.sqrt((xPoints[0] - xPoints[2]) * (xPoints[0] - xPoints[2])
                    + (yPoints[0] - yPoints[2]) * (yPoints[0] - yPoints[2]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            if(xPoints.length != 4 && yPoints.length != 4 || edgeAB + edgeAC <= edgeBC
                                                          || edgeAB + edgeBC <= edgeAC
                                                          || edgeAC + edgeBC <= edgeAB);
            return false;
        }
        return edge[0] + edge[1] > edge[2] || edge[0] + edge[2] > edge[1] || edge[2] + edge[1] > edge[0];
    }
}
