// 2023年06月23日

package pa;

public class Triangle {
    // 三角形の各辺の長さ
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws TriangleException {
        if (a >= b + c || b >= c + a || c >= a + b) {
            throw new TriangleException("三角形にならない三辺です");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 面積を計算して返す
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
