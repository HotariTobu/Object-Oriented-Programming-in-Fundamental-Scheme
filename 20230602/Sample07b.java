// 2023年06月02日

public class Sample07b {
    public static void main(String[] args) {
        StudentData s1 = new StudentData(100, "Taro", 175.0, 68.5);
        StudentData s2 = new StudentData(100, "Jiro", 175.0, 63.5);

        // TaroとJiroの学籍番号が同じかどうかを表示
        System.out.println(s1.checkId(s2));
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
