// 2023年06月02日

public class Hand {
    // 手札（カードの組）
    private Card[] cards;

    public Hand(Card[] cards) {
        this.cards = cards;
    }

    /**
     * 1枚のカードを返す
     * @param i カードの番号
     * @return i番目のカード
     */
    public Card get(int i) {
        return cards[i];
    }

    /**
     * 手札の枚数を返す
     * @return 手札の枚数
     */
    public int size() {
        return cards.length;
    }
}
