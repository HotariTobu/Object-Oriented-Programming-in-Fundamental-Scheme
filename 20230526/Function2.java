// 2023年05月26日

public class Function2 extends Function {
    public Function2(double a, double b) {
        super(a, b);
    }

    public double xValue(double y) {
        return (y - getB()) / getA();
    }
}
