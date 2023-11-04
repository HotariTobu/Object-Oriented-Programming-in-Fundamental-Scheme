// 2023年06月16日

import java.awt.Graphics;

public abstract class MySuper {
    // 中心のx座標
    protected int cx;
    // 中心のy座標
    protected int cy;
    // 半径
    protected int radius;

    public MySuper(int cx, int cy, int radius) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    // なにかを描画するもしないも実装者の自由
    // いいえ、実装者は設計者の言いなりです
    public abstract void draw(Graphics g);
}
