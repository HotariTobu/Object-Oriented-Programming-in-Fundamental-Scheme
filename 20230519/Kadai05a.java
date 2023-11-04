// 2023年05月19日

public class Kadai05a {
    public static void main(String[] args) {
        Player taro = new Player("Taro");
        System.out.println(taro);

        Player jiro = new Player("Jiro", 5, 30);
        System.out.println(jiro);

        System.out.println("敵の攻撃");
        jiro.damage(8);
        System.out.println(jiro);

        System.out.println("敵の攻撃. 痛恨の一撃");
        jiro.damage(50);
        System.out.println(jiro);
    }
}

/* 実行結果 ********************************************************
Taro:level=1 HP=10
Jiro:level=5 HP=30
敵の攻撃
ダメージを受けない
Jiro:level=5 HP=30
敵の攻撃. 痛恨の一撃
ダメージを受けない
Jiro:level=5 HP=30
*******************************************************************/

/* 実行結果 ********************************************************
Taro:level=1 HP=10
Jiro:level=5 HP=30
敵の攻撃
ダメージを受けない
Jiro:level=5 HP=30
敵の攻撃. 痛恨の一撃
Jiro:level=5 HP=0
*******************************************************************/

/* 実行結果 ********************************************************
Taro:level=1 HP=10
Jiro:level=5 HP=30
敵の攻撃
Jiro:level=5 HP=22
敵の攻撃. 痛恨の一撃
Jiro:level=5 HP=0
*******************************************************************/
