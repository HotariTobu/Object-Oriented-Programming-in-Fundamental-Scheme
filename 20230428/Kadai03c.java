// 2023年04月28日

import java.awt.*;
import javax.swing.*;

public class Kadai03c extends JFrame {
    private static int N;

    private MyPanel sp;

    public static void main(String[] args) {
        // if (args.length < 1) {
        //     System.out.println("Usage: command N");
        //     return;
        // }

        // N = Integer.parseInt(args[0]);

        N = 50;

        Kadai03c sm = new Kadai03c();
    }

    public Kadai03c() {
        super("Kadai03c");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);

        sp = new MyPanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class MyPanel extends JPanel {
        private static int XBase = 0;
        private static int YBase = 200;
        private static int Size = 100;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // int x, y_sin, y_cos, y_sum;
            // double RD;

            // int x_base = 0, y_base = 200, size = 100;

            // for (int k = 0; k < 720; k++) {
            //     RD = k * Math.PI / 180;
            //     x = x_base + k;

            //     y_sin = y_base - (int)(Math.sin(RD) * size);
            //     y_cos = y_base - (int)(Math.cos(RD) * size);

            //     // sinとcosの和のy座標
            //     y_sum = y_base - (int)(Math.sin(RD) * size + Math.cos(RD) * size);

            //     g.drawLine(x, y_sin, x, y_sin);
            //     g.drawLine(x, y_cos, x, y_cos);
            //     g.drawLine(x, y_sum, x, y_sum);
            // }

            int lastY = YBase - (int)(_rectWave(0) * Size);

            // for (int k = 0; k < 720; k++) {
            for (int k = 1; k < 720; k++) {
                double radian = k * Math.PI / 180;

                int x = XBase + k;
                int y = YBase - (int)(_rectWave(radian) * Size);

                // g.drawLine(x, y, x, y);

                // 線でつなげる
                g.drawLine(x - 1, lastY, x, y);

                lastY = y;
            }
        }
    }

    // フーリエ級数展開から矩形波の値を計算する関数
    private double _rectWave(double radian) {
        double result = 0;

        for (int h = 1; h <= N; h++) {
            int g = 2 * h - 1;
            result += Math.sin(g * radian) / g;
        }

        return result;
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
