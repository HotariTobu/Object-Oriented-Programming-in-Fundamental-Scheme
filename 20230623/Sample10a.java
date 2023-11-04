// 2023年06月23日

public class Sample10a {
    public static void main(String[] args) {
        int[] n = {3, 5, 1, 9};

        // 例外が投げられる。
        int a = n[4];

        // 実行されない
        System.out.println("実行終了");
    }
}

/* 実行結果 ********************************************************
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at Sample10a.main(Sample10a.java:8)
*******************************************************************/
