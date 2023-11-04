// 2023年04月28日

import java.awt.*;
import javax.swing.*;

public class Kadai03d extends JFrame {
    private MyPanel sp;

    public static void main(String[] args) {
        Kadai03d sm = new Kadai03d();
    }

    public Kadai03d() {
        super("Kadai03d");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 250);

        sp = new MyPanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class MyPanel extends JPanel {
        private static int CenterX = 100;
        private static int CenterY = 100;
        private static int Radius = 80;

        private static int MajorSize = 10;
        private static int MinorSize = 4;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            double majorDif = Math.PI / 6;
            double minorDif = Math.PI / 30;

            for (int majorAngle = 0; majorAngle <= 6; majorAngle++) {
                double majorRadian = majorAngle * majorDif;
                int majorAngle5 = majorAngle * 5;

                _plotCircle(g, majorRadian, MajorSize);
                _plotCircle(g, -majorRadian, MajorSize);

                for (int minorAngle = 0; minorAngle < 5; minorAngle++) {
                    double minorRadian = (majorAngle5 + minorAngle) * minorDif;

                    _plotCircle(g, minorRadian, MinorSize);
                    _plotCircle(g, -minorRadian, MinorSize);
                }
            }
        }

        // 指定した角の位置に指定した大きさの円を描画する関数
        private static void _plotCircle(Graphics g, double radian, int size) {
            int x = (int) (Math.cos(radian) * Radius);
            int y = (int) (Math.sin(radian) * Radius);

            int halfSize = size / 2;

            g.fillOval(x - halfSize + CenterX, y - halfSize + CenterY, size, size);
        }
    }
}

/*
 * 実行結果 ********************************************************
 *
 *******************************************************************/
