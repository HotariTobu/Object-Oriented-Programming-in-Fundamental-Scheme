// 2023年06月16日

public class Sample09a {
    public static void main(String[] args) {
        // スーパークラスの型に変換
        GameSys gs = new DiceGame();

        // 多態性を利用
        gs.playGame();
    }
}

/* 実行結果 ********************************************************
■■サイコロゲーム■■
サイコロの目＝3
現在までの得点＝3
続けますか？　１：続ける、０：終了する
1
サイコロの目＝5
現在までの得点＝8
続けますか？　１：続ける、０：終了する
1
サイコロの目＝1
現在までの得点＝9
続けますか？　１：続ける、０：終了する
1
サイコロの目＝1
現在までの得点＝10
続けますか？　１：続ける、０：終了する
1
サイコロの目＝4
現在までの得点＝14
続けますか？　１：続ける、０：終了する
0
*******************************************************************/