// 2023年06月16日

import java.util.Scanner;

public class Sample09b {
    public static void main(String[] args) {
        GameSys gs = createGame();
        gs.playGame();
    }

    // GameSys型のオブジェクトを作成して返す
    public static GameSys createGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: DiceGame, otherwise: AnotherGame");
        int n = sc.nextInt();

        if (n == 1) {
            return new DiceGame();
        }
        else {
            return new AnotherGame();
        }
    }
}

/* 実行結果 ********************************************************
1: DiceGame, otherwise: AnotherGame
0
続けますか？　１：続ける、０：終了する
0
*******************************************************************/
