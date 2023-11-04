// 2023年05月26日

/**
 * 2行2列の行列
 * v00 v01
 * v10 v11
 * を表す
 */
public class Matrix2x2 {
    private double v00;
    private double v01;
    private double v10;
    private double v11;

    public Matrix2x2(double v00, double v01, double v10, double v11) {
        this.v00 = v00;
        this.v01 = v01;
        this.v10 = v10;
        this.v11 = v11;
    }

    public Vector2 multiply(Vector2 vector) {
        double v0 = vector.getV0();
        double v1 = vector.getV1();

        return new Vector2(
            v00 * v0 + v01 * v1,
            v10 * v0 + v11 * v1
        );
    }
}
