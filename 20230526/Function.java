// 2023年05月26日

// 1次式ax + bの値を計算する
public class Function {
    // ax + bのaの値
    private double a;
    // ax + bのbの値
    private double b;

    public Function(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double value(double x) {
        return a * x + b;
    }

    // y=2.0x+5.0のような文字列を返す
    @Override
    public String toString() {
        return "y=" + a + "x+" + b;
    }
}
