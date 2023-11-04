// 2023年05月19日

public class Kadai05b {
    public static void main(String[] args) {
        Dice2.showSum();

        Dice2 d1 = new Dice2();
        Dice2 d2 = new Dice2(52);
        Dice2 d3 = new Dice2("S");
        Dice2 d4 = new Dice2(3, "L", 1000);

        Dice2.showSum();
    }
}

/* 実行結果 ********************************************************
作成したサイコロは0個です
作成したサイコロは4個です
*******************************************************************/
