// 2023年06月02日

public class DicePlayer extends GamePlayer {
    // サイコロのオブジェクト
    protected Dice dice;

    public DicePlayer(String name, int score) {
        super(name, score);

        dice = new Dice();
    }

    @Override
    public void play() {
        dice.play();
        setScore(dice.getN());
    }
}
