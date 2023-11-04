public class MyRing extends MyCircle {
    private double r2 = 0;

    public MyRing(double cx, double cy, double r, double r2) {
        super(cx, cy, r);

        if (r2 > 0.5) {
            this.r2 = r2;
        }
    }

    public MyRing(double cx, double cy, double r) {
        this(cx, cy, r, r / 2);
    }

    public double areaRing() {
        return area() - new MyCircle(0, 0, r2).area();
    }
}
