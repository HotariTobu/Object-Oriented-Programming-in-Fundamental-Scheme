// 2023年06月02日

public class Kadai07b {
    public static void main(String[] args) {
        int[] n = {13, 25, 22, 7, 11};

        Dice a = new Dice();
        Dice b = new Dice();

        SumSample summer = new SumSample();

        summer.sum(n);

        a.play();
        b.play();
        System.out.println("1つ目のサイコロの目は：" + a.getN());
        System.out.println("2つ目のサイコロの目は：" + b.getN());

        summer.sum(a, b);
    }
}

/* 実行結果 ********************************************************
配列の合計=78
1つ目のサイコロの目は：3
2つ目のサイコロの目は：2
Diceの合計=5
*******************************************************************/
