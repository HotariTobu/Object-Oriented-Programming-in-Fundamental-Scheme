// 2023年06月09日

import java.awt.Graphics;

public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        // 円を描画
        g.drawOval(getX() - 5, getY() - 5, 10, 10);
    }
}
