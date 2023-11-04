// 2023年06月16日

import java.awt.Graphics;

// 正多角形を描画する
public class MyPolygon extends MySuper {
    // 正n角形のn
    private int n;

    public MyPolygon(int cx, int cy, int radius, int n) {
        super(cx, cy, radius);

        this.n = n;
    }

    @Override
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
