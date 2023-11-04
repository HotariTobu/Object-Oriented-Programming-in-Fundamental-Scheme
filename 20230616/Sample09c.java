// 2023年06月16日

import java.util.Scanner;

public class Sample09c {
    public static void main(String[] args) {
        Information info = new DiceGame();

        System.out.println(info.className());
        System.out.println(info.exp());

        // コンパイルエラー
        // info.init();
        // これはDiceGame型にキャストしているびでOK
        ((DiceGame)info).init();
    }
}

/* 実行結果 ********************************************************
DiceGameクラス
サイコロゲームです
■■サイコロゲーム■■
*******************************************************************/
