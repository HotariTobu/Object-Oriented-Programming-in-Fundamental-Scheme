// 2023年06月02日

public class Card {
    // 0: スペード、1: ハート、2: クラブ、3: ダイヤ
    private int suit;

    // [1, 13]
    private int number;

    public Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        final String[] suitStrs = {"スペード", "ハート", "クラブ", "ダイヤ"};
        return "[" + suitStrs[suit] + "]:[" + number + "]";
    }
}
