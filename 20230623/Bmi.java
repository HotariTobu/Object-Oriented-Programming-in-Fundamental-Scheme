// 2023年06月23日

public class Bmi {
    // 身長
    private double height;
    // 体重
    private double weight;

    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // メソッドで例外を投げる
    public double value() throws Exception {
        // 身長のデータが正しいかどうか調べる
        if (height <= 0) {
            throw new Exception("身長は正です");
        }

        // 体重のデータが正しいかどうか調べる
        else if (weight <= 0) {
            throw new Exception("体重は正です");
        }

        // BMIを計算して返す
        return 10000 * weight / (height * height);
    }
}
