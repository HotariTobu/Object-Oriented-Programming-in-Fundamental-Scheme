// 2023年04月21日

public class Triangle {
    // 三角形の三辺
    private double a;
    private double b;
    private double c;

    // 辺aをxに、辺bをyに、辺cをzに設定する
    public void setValues(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    // 三角形の三辺の値を表示する
    public void show() {
        System.out.print("a=" + a + ", ");
        System.out.print("b=" + b + ", ");
        System.out.print("c=" + c + "\n");
    }

    // 面積を返す
    public double area() {
        // ヘロンの公式を使う
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
