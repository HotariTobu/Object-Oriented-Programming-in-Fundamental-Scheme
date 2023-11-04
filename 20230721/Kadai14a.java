// 2023年07月21日

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai14a extends JFrame {
    private final double h = 0.02;

    private final double x0 = 20;
    private final double y0 = 10;

    private final double alpha = 0.5;
    private final double beta = 0.01;
    private final double gamma = 0.8;
    private final double delta = 0.01;

    private int n = 300;

    public static void main(String[] args) {
        new Kadai14a();
    }

    public Kadai14a() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 無名クラス
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(getWidth() / 2, getHeight() / 2);
                g2d.scale(1, -1);

                g2d.scale(2, 2);

                draw(g2d);
            };
        };

        getContentPane().add(panel);
        setSize(600, 700);
        setVisible(true);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                Thread.sleep(1000);

                System.out.print("n: ");
                n = scanner.nextInt();

                repaint();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        scanner.close();

        this.dispose();
    }

    public void draw(Graphics g) {
        // x軸とy軸を描画
        g.drawLine(0, -100, 0, 100);
        g.drawLine(-100, 0, 100, 0);

        // 初期値に印をつける
        g.drawLine((int)x0 - 5, (int)y0, (int)x0 + 5, (int)y0);
        g.drawLine((int)x0, (int)y0 - 5, (int)x0, (int)y0 + 5);

        double t = 0;
        double x = x0;
        double y = y0;

        g.setColor(Color.red);
        for (int i = 0; i < n; i++) {
            double xx = x + h * (alpha * x - beta * x * y);
            double yy = y + h * (-gamma * y + delta * x * y);

            g.drawLine((int)x, (int)y, (int)xx, (int)yy);

            t += h;
            x = xx;
            y = yy;

            double d = Math.pow(x - x0, 2) + Math.pow(y - y0, 2);
            System.out.println("i: " + i + "\tt: " + t + "\tx: " + x + "\ty: " + y + "\td: " + d);
        }
    }
}

/* 実行結果 ********************************************************
i: 634  t: 12.699999999999818   x: 19.14998944557706    y: 8.624375901665868   d: 2.614859602547989
*******************************************************************/
