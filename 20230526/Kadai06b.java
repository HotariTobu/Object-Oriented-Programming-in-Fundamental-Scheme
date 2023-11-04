// 2023年05月26日

public class Kadai06b {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Taro");

        // StudentCopyのcopyメソ度を呼び出し
        // s1のコピーを作成してs2ぶ代入する
        Student s2 = StudentCopy.copy(s1);

        System.out.println(s1.getId() + "/" + s1.getName());
        System.out.println(s2.getId() + "/" + s2.getName());
    }
}

/* 実行結果 ********************************************************
100/Taro
100/Taro
*******************************************************************/
