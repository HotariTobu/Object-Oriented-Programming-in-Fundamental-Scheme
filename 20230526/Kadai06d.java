// 2023年05月26日

public class Kadai06d {
    public static void main(String[] args) {
        Function2 func = new Function2(2, 5);

        System.out.println(func);

        // (1)
        // valueメソッドを使って、xが1.0, 2.0, ..., 5.0の5つの場合について、y=2x+5のyの値を計算する
        for (int i = 1; i <= 5; i++) {
            double x = i;
            double y = func.value(x);

            System.out.printf("(%.1f, %.1f) ", x, y);
        }

        System.out.println();

        // (3)
        // xValueメソッドを使って、yが1.0, 2.0, ..., 5.0の5つの場合について、y=2x+5のxの値を計算する
        for (int i = 1; i <= 5; i++) {
            double y = i;
            double x = func.xValue(y);

            System.out.printf("(%.1f, %.1f) ", x, y);
        }

        System.out.println();
    }
}

/* 実行結果 ********************************************************
y=2.0x+5.0
(1.0, 7.0) (2.0, 9.0) (3.0, 11.0) (4.0, 13.0) (5.0, 15.0)
(-2.0, 1.0) (-1.5, 2.0) (-1.0, 3.0) (-0.5, 4.0) (0.0, 5.0)
*******************************************************************/
