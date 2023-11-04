// 2023年04月14日

import java.awt.*;

public class RedCircle {
    private int centerX;
    private int centerY;
    private int radius1;
    private int radius2;

    public RedCircle(int x, int y, int r1, int r2) {
        centerX = x;
        centerY = y;
        radius1 = r1;
        radius2 = r2;
    }

    public RedCircle(int x, int y) {
        this(x, y, 5, 10);
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);

        int d1 = radius1 * 2;
        int d2 = radius2 * 2;

        g.drawOval(centerX - radius1, centerY - radius1, d1, d1);
        g.drawOval(centerX - radius2, centerY - radius2, d2, d2);
    }
}
