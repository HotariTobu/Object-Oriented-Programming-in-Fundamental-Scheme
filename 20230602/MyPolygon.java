// 2023年06月02日

import java.awt.Graphics;

public class MyPolygon {
    // 円の中心のx座標
    private int cx;
    // 円の中心のy座標
    private int cy;

    // 円の半径
    private int radius;

    // 正n角形のn
    private int n;

    public MyPolygon(int cx, int cy, int radius, int n) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.n = n;
    }

    public void draw(Graphics g) {
        int[] xs = new int[n];
        int[] ys = new int[n];

        double dr = Math.PI * 2 / n;

        for (int i = 0; i < n; i++) {
            xs[i] = cx + (int)(Math.cos(dr * i) * radius);
            ys[i] = cy + (int)(Math.sin(dr * i) * radius);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                g.drawLine(xs[i], ys[i], xs[j], ys[j]);
            }
        }
    }
}
