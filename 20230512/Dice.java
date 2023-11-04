// 2023年05月12日

public class Dice {
    // 目の数
    private int n;

    // サイズ
    private String size;

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
    public void play() {
        // nに1から6のどれかを代入する
        int n = (int)(Math.random() * 6) + 1;
        setN(n);
    }
}
