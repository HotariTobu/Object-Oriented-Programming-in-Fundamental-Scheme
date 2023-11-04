public class MyCircle {
    private double cx;
    private double cy;
    private double r;

    public MyCircle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public boolean contain() {
        double x2 = cx * cx;
        double y2 = cy * cy;
        double r2 = r * r;
        return x2 + y2 < r2;
    }

    public double getX() {
        return cx;
    }

    public double getR() {
        return r;
    }

    public String toString() {
        return "(" + cx + ", " + cy + ") r=" + r;
    }

    public MyCircle resize(double a) {
        return new MyCircle(cx, cy, r * a);
    }

    public MyCircle move(double p, double q) {
        return new MyCircle(cx + p, cy + q, r);
    }
}
