// 2023年07月07日

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai12d {
    // 円の中心座標
    int x = 70;
    int y = 70;

    // 円が移動する距離
    int vx = 1;
    int vy = 1;

    // 円の半径
    int r = 20;

    public static void main(String[] args) {
        Kadai12d gui = new Kadai12d();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 内部クラスのオブジェクトを作成
        MyDrawPanel drawPanel = new MyDrawPanel();
        drawPanel.setBackground(Color.white);

        frame.getContentPane().add(drawPanel);
        frame.setSize(500, 400);
        frame.setVisible(true);

        while (true) {
            x += vx;
            y += vy;

            int minX = 50 + r;
            int minY = 50 + r;
            int maxX = drawPanel.getWidth() - 50 - r;
            int maxY = drawPanel.getHeight() - 50 - r;

            if (x <= minX) {
                x = minX;
                vx = 1;
            }

            if (y <= minY) {
                y = minY;
                vy = 1;
            }

            if (maxX <= x) {
                x = maxX;
                vx = -1;
            }

            if (maxY <= y) {
                y = maxY;
                vy = -1;
            }

            drawPanel.repaint();

            try {
                // 少し遅延させる
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawRect(50, 50, this.getWidth() - 100, this.getHeight() - 100);
            g.setColor(Color.blue);
            g.fillOval(x - r, y - r, 2 * r, 2 * r);
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
