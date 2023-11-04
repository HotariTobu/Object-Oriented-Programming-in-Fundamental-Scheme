// 2023年06月02日

public class GamePlayer {
    // プレイヤーの名前
    private String name;
    // 得点
    private int score;

    public GamePlayer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * ゲームを実行する
     */
    public void play() {
        // サブクラスでオーバーライドするので処理内容は空にする
    }

    /**
     * 相手と得点を比較し、数値を返す
     * @param p 相手のプレイヤーオブジェクト
     * @return 自分の得点のほうが大きいときは正の値、相手の得点のほうが大きいときは負の値、得点が同じ場合は0
     */
    public int compareTo(GamePlayer p) {
        return score - p.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "=" + score;
    }
}
