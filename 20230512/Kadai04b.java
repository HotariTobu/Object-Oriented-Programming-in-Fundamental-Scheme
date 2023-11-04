// 2023年05月12日

public class Kadai04b {
    public static void main(String[] args) {
        Dice2 d1 = new Dice2();
        Dice2 d2 = new Dice2(52);
        Dice2 d3 = new Dice2("S");
        Dice2 d4 = new Dice2(3, "L", 1000);

        System.out.println("d1=" + d1.play());
        System.out.println("d2=" + d2.play());
        System.out.println("d3=" + d3.play());
        System.out.println("d4=" + d4.play());
    }
}

/* 実行結果 ********************************************************
d1=2
d2=37
d3=4
d4=765
*******************************************************************/
