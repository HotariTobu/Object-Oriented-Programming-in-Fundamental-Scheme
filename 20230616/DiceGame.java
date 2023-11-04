// 2023年06月16日

public class DiceGame extends GameSys implements Information {
    private Dice dice;
    private int score;

    public DiceGame() {
        dice = new Dice();
        score = 0;
    }

    @Override
    protected void init() {
        System.out.println("■■サイコロゲーム■■");
    }

    @Override
    protected void play() {
        dice.play();
        System.out.println("サイコロの目＝" + dice.getN());
    }

    @Override
    protected void eval() {
        score += dice.getN();
        System.out.println("現在までの得点＝" + score);
    }

    @Override
    public String className() {
        return "DiceGameクラス";
    }

    @Override
    public String exp() {
        return "サイコロゲームです";
    }
}
