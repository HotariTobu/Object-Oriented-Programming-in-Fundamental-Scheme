// 2023年06月02日

public class Kadai07f {
    public static void main(String[] args) {
        // トランプカードの配列を作成
        Card[] cards = {
            new Card(0, 3),
            new Card(1, 12),
            new Card(3, 7),
        };

        Hand h = new Hand(cards);

        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.get(i));
        }
    }
}

/* 実行結果 ********************************************************
[スペード]:[3]
[ハート]:[12]
[ダイヤ]:[7]
*******************************************************************/
