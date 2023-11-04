// 2023年06月09日

import java.awt.Graphics;

public class Rectangle extends Shape {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        // 四角形を描画
        g.drawRect(getX() - 5, getY() - 5, 10, 10);
    }
}
