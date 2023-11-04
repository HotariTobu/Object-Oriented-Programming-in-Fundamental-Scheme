// 2023年04月21日

public class HealthRecord {
    // 名前
    private String name;

    // 身長
    private double height;

    // 体重
    private double weight;

    public HealthRecord(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public HealthRecord(double height, double weight) {
        this("データなし", height, weight);
    }

    public HealthRecord(double height) {
        this(height, 60);
    }

    public HealthRecord() {
        this(170);
    }

    @Override
    public String toString() {
        return name + "/" + height + "/" + weight;
    }

    public double bmi() {
        return 10000 * weight / (height * height);
    }
}
