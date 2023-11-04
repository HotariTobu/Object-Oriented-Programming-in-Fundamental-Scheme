// 2023年05月26日

public class StudentBmi extends StudentData {
    public StudentBmi(int id, String name, double height, double weight) {
        super(id, name, height, weight);
    }

    public double bmi() {
        return 10000 * getWeight() / (height * height);
    }
}
