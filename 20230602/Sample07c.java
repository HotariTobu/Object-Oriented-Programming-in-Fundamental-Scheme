// 2023年06月02日

public class Sample07c {
    public static void main(String[] args) {
        StudentData st = new StudentData(100, "Taro", 175.0, 68.5);

        // Studentクラスから継承したwhoメソッド
        st.who();

        // オーバーロードしたwhoメソッド
        st.who("/");
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
