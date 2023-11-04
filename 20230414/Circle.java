// 2023年04月14日

import java.awt.*;

public class Circle {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        // g.setColor(Color.black);
        g.setColor(Color.red); // (1) 円の色が赤くなるように

        // g.drawOval(x, y, 10, 10);
        g.drawOval(x, y, 100, 10); // (2) 円の代わりに横長の楕円になるように
    }
}
