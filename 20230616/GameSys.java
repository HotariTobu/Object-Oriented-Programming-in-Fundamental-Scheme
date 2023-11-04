// 2023年06月16日

import java.util.Scanner;

// public class GameSys {
public abstract class GameSys {
    public void playGame() {
        // タイトル表示などの開始処理
        init();

        do {
            // ゲームを1回実行する
            play();

            // ゲームの結果を評価する
            eval();
        }
        while (next());
    }

    // 繰り返し判定
    public boolean next() {
        Scanner sc = new Scanner(System.in);

        System.out.println("続けますか？　１：続ける、０：終了する");
        int x = sc.nextInt();

        // sc.close();

        return x == 1;
    }

    // protected void init() {}
    // protected void play() {}
    // protected void eval() {}

    protected abstract void init();
    protected abstract void play();
    protected abstract void eval();
}
