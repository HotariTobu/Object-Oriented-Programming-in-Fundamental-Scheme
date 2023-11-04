// 2023年06月02日

public class Sample07a {
    public static void main(String[] args) {
        StudentBmi sd1 = new StudentBmi(100, "Taro", 175.0, 68.5);
        Student st1 = sd1;

        // スーパークラス型からサブクラス型への型変換はエラー
        // Student st2 = new Student(100, "Taro");
        // StudentBmi sd2 = st2; // エラー: 不適合な型

        System.out.println(st1.getId());
        System.out.println(st1.getName());
        // System.out.println(st1.getHeight()); // コンパイルエラー
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
