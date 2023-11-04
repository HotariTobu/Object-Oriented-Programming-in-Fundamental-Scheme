// 2023年05月26日

/**
 * ベクトル(v0 v1)を表す
 */
public class Vector2 {
    private double v0;
    private double v1;

    public Vector2(double v0, double v1) {
        this.v0 = v0;
        this.v1 = v1;
    }

    public double getV0() {
        return v0;
    }

    public double getV1() {
        return v1;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(
            v0 + other.v0,
            v1 + other.v1
        );
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", v0, v1);
    }
}
