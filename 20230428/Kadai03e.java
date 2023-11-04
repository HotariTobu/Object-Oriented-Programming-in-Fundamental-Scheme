// 2023年04月28日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kadai03e extends JFrame {
    private static final int CenterX = 100;
    private static final int CenterY = 100;

    private static final double MajorDif = Math.PI / 6;
    private static final double MinorDif = Math.PI / 30;

    private ClockBase cb;
    private ClockHands ch;

    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.get(Calendar.HOUR));
        System.out.println(cl.get(Calendar.MINUTE));
        System.out.println(cl.get(Calendar.SECOND));

        Kadai03e sm = new Kadai03e();
    }

    public Kadai03e() {
        super("Kadai03e");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 250);

        cb = new ClockBase();
        add(cb, BorderLayout.CENTER);

        ch = new ClockHands();
        cb.add(ch, BorderLayout.CENTER);

        setVisible(true);
    }

    public class ClockBase extends JPanel {
        private static final int Radius = 80;

        private static final int MajorSize = 10;
        private static final int MinorSize = 4;

        public ClockBase() {
            // 重ねるためにレイアウトを設定する
            setLayout(new BorderLayout());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int majorAngle = 0; majorAngle <= 6; majorAngle++) {
                double majorRadian = majorAngle * MajorDif;
                int majorAngle5 = majorAngle * 5;

                _plotCircle(g, majorRadian, MajorSize);
                _plotCircle(g, -majorRadian, MajorSize);

                for (int minorAngle = 0; minorAngle < 5; minorAngle++) {
                    double minorRadian = (majorAngle5 + minorAngle) * MinorDif;

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

    public class ClockHands extends JPanel {
        private static final int HourRadius = 40;
        private static final int MinuteRadius = 60;
        private static final int SecondRadius = 70;

        private static final double BaseRadius = -Math.PI / 2;

        public ClockHands() {
            // 重ねるために背景を描画しない
            setOpaque(false);

            ClockUpdater updater = new ClockUpdater(this);
            new javax.swing.Timer(1000, updater).start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Calendar cl = Calendar.getInstance();
            double hourRadian = MajorDif * cl.get(Calendar.HOUR);
            double minuteRadian = MinorDif * cl.get(Calendar.MINUTE);
            double secondRadian = MinorDif * cl.get(Calendar.SECOND);

            hourRadian += minuteRadian / 12;
            minuteRadian += secondRadian / 60;

            g.setColor(Color.RED);
            _drawLine(g, BaseRadius + hourRadian, HourRadius);

            g.setColor(Color.GREEN);
            _drawLine(g, BaseRadius + minuteRadian, MinuteRadius);

            g.setColor(Color.BLUE);
            _drawLine(g, BaseRadius + secondRadian, SecondRadius);
        }

        // 指定した角の方向にに指定した長さの線分を描画する関数
        private static void _drawLine(Graphics g, double radian, int radius) {
            int x = (int) (Math.cos(radian) * radius);
            int y = (int) (Math.sin(radian) * radius);

            g.drawLine(CenterX, CenterY, CenterX + x, CenterY + y);
        }
    }

    private class ClockUpdater implements ActionListener {
        private ClockHands ch;

        public ClockUpdater(ClockHands ch) {
            this.ch = ch;
        }

        public void actionPerformed(ActionEvent evt) {
            ch.repaint();
        }
    }
}

/*
 * 実行結果 ********************************************************
 *
 *******************************************************************/
