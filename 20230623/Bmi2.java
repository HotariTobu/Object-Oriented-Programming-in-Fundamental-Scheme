// 2023年06月23日

public class Bmi2 {
    // 身長
    private double height;
    // 体重
    private double weight;

    // コンストラクタで例外を投げる
    public Bmi2(double height, double weight) throws Exception {
        // データが正しいかどうか調べる
        if (height <= 0 || weight <= 0) {
            // 不正なら例外オブジェクトを作成して投げる
            throw new Exception();
        }

        this.height = height;
        this.weight = weight;
    }

    public double value() throws Exception {
        // BMIを計算して返す
        return 10000 * weight / (height * height);
    }
}
