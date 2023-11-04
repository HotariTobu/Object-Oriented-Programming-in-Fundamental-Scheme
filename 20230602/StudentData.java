// 2023年05月26日

public class StudentData extends Student {
    // 身長
    protected double height;
    // 体重
    private double weight;

    public StudentData(int id, String name, double height, double weight) {
        super(id, name);

        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // これはオーバーロード
    public void who(String delm) {
        System.out.println(getId() + delm + getName());
    }

    @Override
    public void who() {
        who("/");
    }
}
