// 2023年04月21日

public class Kadai02c {
    public static void main(String[] args) {
        Range range = new Range();

        // 範囲を設定する
        range.setMin(50.0);
        range.setMax(250.0);

        System.out.println(range.outputRange());

        double v = 150.5;

        if (range.isOK(v)) {
            System.out.println(v + " 範囲内");
        }
        else {
            System.out.println(v + " 範囲外");
        }
    }
}

/* 実行結果 ********************************************************
min:50.0 -- max:250.0
150.5 範囲内
*******************************************************************/
