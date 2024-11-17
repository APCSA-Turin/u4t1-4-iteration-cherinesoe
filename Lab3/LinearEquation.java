public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
 
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
 
    public double yIntercept() {
        double yInt = y1 - slope * x1;
        return yInt;
    }
 
    public double slope() {
        slope = (double) (y2 - y1) / (x2 - x1);
        return slope;
    }
 }
 