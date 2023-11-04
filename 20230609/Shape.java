// 2023年06月09日

import java.awt.Graphics;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // サブクラスでオーバーライドするので処理内容は空にする
    public void draw(Graphics g) {}
}
