// 2023年06月02日

public class Kadai07e {
    public static void main(String[] args) {
        Dice a, b;
        a = new Dice();
        b = a;

        a.play();

        System.out.println("a.n=" + a.getN());
        System.out.println("b.n=" + b.getN());
    }
}

/* 実行結果 ********************************************************
a.n=1
b.n=1
*******************************************************************/

/* 実行結果 ********************************************************
a.n=5
b.n=5
*******************************************************************/

/* 実行結果 ********************************************************
a.n=6
b.n=6
*******************************************************************/

/* 実行結果 ********************************************************
a.n=2
b.n=2
*******************************************************************/