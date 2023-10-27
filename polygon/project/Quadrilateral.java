package hk1_22001665_CaoSyNguyenVu.polygon.project;

public class Quadrilateral implements Polygon {
    private double[] edge;
    private double[] xPoints;
    private double[] yPoints;

    public Quadrilateral(double[] edge) {
        this.edge = edge;
    }

    public Quadrilateral(double[] xPoints, double[] yPoints) {
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public double area() {
        if(!isQuadrilateral()){
            return -1;
        }
        double edgeBD = Math.sqrt((xPoints[1] - xPoints[3]) * (xPoints[1] - xPoints[3])
                + (yPoints[1] - yPoints[3]) * (yPoints[1] - yPoints[3]));
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAD = Math.sqrt((xPoints[0] - xPoints[3]) * (xPoints[0] - xPoints[3])
                    + (yPoints[0] - yPoints[3]) * (yPoints[0] - yPoints[3]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            double edgeCD = Math.sqrt((xPoints[3] - xPoints[2]) * (xPoints[3] - xPoints[2])
                    + (yPoints[3] - yPoints[2]) * (yPoints[3] - yPoints[2]));

            double[] arrayEdge1 = new double[]{edgeAB, edgeAD, edgeBD};
            double[] arrayEdge2 = new double[]{edgeBC, edgeCD, edgeBD};
            return sumArea(arrayEdge1, arrayEdge2);
        }
        double[] arrayEdge1 = new double[]{edge[0], edge[3], edgeBD};
        double[] arrayEdge2 = new double[]{edge[1], edge[2], edgeBD};
        return sumArea(arrayEdge1, arrayEdge2);
    }

    private double sumArea(double[] a, double[] b){
        Triangle sABD = new Triangle(a);
        Triangle sCBD = new Triangle(b);
        return sCBD.area() + sABD.area();
    }

    @Override
    public double perimeter() {
        if(!isQuadrilateral()){
            return -1;
        }
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAD = Math.sqrt((xPoints[0] - xPoints[3]) * (xPoints[0] - xPoints[3])
                    + (yPoints[0] - yPoints[3]) * (yPoints[0] - yPoints[3]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            double edgeCD = Math.sqrt((xPoints[3] - xPoints[2]) * (xPoints[3] - xPoints[2])
                    + (yPoints[3] - yPoints[2]) * (yPoints[3] - yPoints[2]));
            return edgeAD + edgeAB + edgeBC + edgeCD;
        }
        return edge[0] + edge[1] + edge[2] + edge[3];
    }

    private boolean condition(double[] array) {
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    total += array[j];
                }
            }
            if (total <= array[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isQuadrilateral() {
        if (edge.length != 4 || xPoints.length != 4 || yPoints.length != 4) {
            return false;
        }
        if (edge == null) {
            double edgeAB = Math.sqrt((xPoints[0] - xPoints[1]) * (xPoints[0] - xPoints[1])
                    + (yPoints[0] - yPoints[1]) * (yPoints[0] - yPoints[1]));
            double edgeAD = Math.sqrt((xPoints[0] - xPoints[3]) * (xPoints[0] - xPoints[3])
                    + (yPoints[0] - yPoints[3]) * (yPoints[0] - yPoints[3]));
            double edgeBC = Math.sqrt((xPoints[1] - xPoints[2]) * (xPoints[1] - xPoints[2])
                    + (yPoints[1] - yPoints[2]) * (yPoints[1] - yPoints[2]));
            double edgeCD = Math.sqrt((xPoints[3] - xPoints[2]) * (xPoints[3] - xPoints[2])
                    + (yPoints[3] - yPoints[2]) * (yPoints[3] - yPoints[2]));
            double[] sides = new double[]{edgeAB, edgeAD, edgeBC, edgeCD};
            return condition(sides);
        }

        return condition(edge);

    }
}
