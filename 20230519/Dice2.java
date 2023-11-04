// 2023年05月19日

// 汎用的なサイコロクラス
public class Dice2 {
    // 作成したサイコロの数
    static int sum = 0;


    // 目の数
    private int n;

    // サイズ
    private String size;

    // サイコロの目の最大値
    private int max;


    // 1つめのコンストラクタ
    public Dice2(int n, String size, int max) {
        sum++;

        this.n = n;
        this.size = size;
        this.max = max;
    }

    // 2つめのコンストラクタ
    public Dice2(int max) {
        this(1, "M", max);
    }

    // 3つめのコンストラクタ
    public Dice2(String size) {
        this(1, size, 6);
    }

    // 4つめのコンストラクタ
    public Dice2() {
        this(1, "M", 6);
    }


    // 目の数を返す
    public int getN() {
        return this.n;
    }

    // サイズを返す
    public String getSize() {
        return this.size;
    }

    // 目の数を設定する
    public void setN(int n) {
        this.n = n;
    }

    // サイズを設定する
    public void setSize(String size) {
        this.size = size;
    }


    // サイコロを振る
    // 1以上max以下の値を返す
    public int play() {
        n = (int) (Math.random() * max) + 1;
        return n;
    }


    public static void showSum() {
        System.out.println("作成したサイコロは" + sum + "個です");
    }
}
