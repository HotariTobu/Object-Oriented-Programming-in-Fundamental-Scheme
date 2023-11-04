// 2023年06月23日

public class Sample10b {
    public static void main(String[] args) {
        int a = 123;
        int b = 0;

        // 例外が投げられる。
        int c = a / b;

        // 実行されない
        System.out.println("実行終了");
    }
}

/* 実行結果 ********************************************************
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Sample10b.main(Sample10b.java:9)
*******************************************************************/
