// 2023年06月02日

public class SumSample {
    /**
     * 配列の要素の合計を出力する
     * @param n 配列
     */
    public void sum(int[] n) {
        int sum = 0;

        for (int v : n) {
            sum += v;
        }

        System.out.println("配列の合計=" + sum);
    }

    /**
     * サイコロの目の数の合計を出力する
     * @param d1 1つ目のサイコロ
     * @param d2 2つ目のサイコロ
     */
    public void sum(Dice d1, Dice d2) {
        int sum = d1.getN() + d2.getN();
        System.out.println("Diceの合計=" + sum);
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
