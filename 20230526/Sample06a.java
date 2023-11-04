// 2023年05月26日

public class Sample06a {
    public static void main(String[] args) {
        StudentData sd = new StudentData(100, "Taro", 175.0, 68.5);

        // Studentクラスから継承したメソッドを使用
        System.out.println(sd.getId());
        System.out.println(sd.getName());

        // StudentDataクラスで拡張したメソッドを使用
        System.out.println(sd.getHeight());
        System.out.println(sd.getWeight());
    }
}
