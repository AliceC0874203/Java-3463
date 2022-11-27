public class Triangle {
    private double x1 = 0;
    private double y1 = 0;
    private double x2 = 0;
    private double y2 = 0;
    private double x3 = 0;
    private double y3 = 0;

    public double getLine1() {
        return calculate(x1, x2, y1, y2);
    }

    public void setLine1(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getLine2() {
        return calculate(x2, x3, y2, y3);
    }

    public void setLine2(double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLine3() {
        return calculate(x3, x1, y3, y1);
    }

    public void setLine3(double x3, double y3) {
        this.x3 = x3;
        this.y3 = y3;
    }

    private double calculate(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}
