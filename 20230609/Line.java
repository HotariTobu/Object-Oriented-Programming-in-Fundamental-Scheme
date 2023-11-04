// 2023年06月09日

import java.awt.Graphics;

public class Line extends Shape {
    public Line(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        // 直線を描画
        g.drawLine(getX(), getY(), getX() + 10, getY() + 10);
    }
}
