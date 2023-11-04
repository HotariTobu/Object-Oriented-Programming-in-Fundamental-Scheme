// 2023年06月02日

public class Kadai07a {
    public static void main(String[] args) {
        DicePlayer p1 = new DicePlayer("Taro", 0);
        DicePlayer p2 = new DicePlayer("Jiro", 0);

        p1.play();
        p2.play();

        System.out.println(p1);
        System.out.println(p2);

        int result = p1.compareTo(p2);
        if (result < 0) {
            System.out.println(p2.getName() + "の勝ち");
        }
        else if (result > 0) {
            System.out.println(p1.getName() + "の勝ち");
        }
        else {
            System.out.println("引き分け");
        }
    }
}

/* 実行結果 ********************************************************
Taro=3
Jiro=3
引き分け
*******************************************************************/

/* 実行結果 ********************************************************
Taro=4
Jiro=5
Jiroの勝ち
*******************************************************************/

/* 実行結果 ********************************************************
Taro=5
Jiro=3
Taroの勝ち
*******************************************************************/
