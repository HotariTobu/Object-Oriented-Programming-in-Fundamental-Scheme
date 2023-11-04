// 2023年05月26日

public class Kadai06a {
    public static void main(String[] args) {
        // オブジェクトを作成
        StudentBmi sd = new StudentBmi(100, "Taro", 175.0, 68.5);

        // Studentクラスから継承したメソッドを使用
        System.out.println(sd.getId());
        System.out.println(sd.getName());

        // StudentDataクラスで拡張したメソッドを使用
        System.out.println(sd.getHeight());
        System.out.println(sd.getWeight());

        // StudentBmiクラスで拡張したメソッドを使用
        System.out.println(sd.bmi());
    }
}

/* 実行結果 ********************************************************
100
Taro
175.0
68.5
22.367346938775512
*******************************************************************/
