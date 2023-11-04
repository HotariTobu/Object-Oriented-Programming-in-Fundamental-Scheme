// 2023年06月23日

public class Sample10c {
    public static void main(String[] args) {
        int[] n = {3, 5, 1, 9};

        try {
            // 例外が投げられる。
            int a = n[4];

            // 実行されない
            System.out.println("例外発生");
        } catch (RuntimeException e) {
            System.out.println("例外情報：" + e);
            e.printStackTrace();
        }

        // 実行される
        System.out.println("実行終了");
    }
}

/* 実行結果 ********************************************************
例外情報：java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at Sample10c.main(Sample10c.java:9)
実行終了
*******************************************************************/
