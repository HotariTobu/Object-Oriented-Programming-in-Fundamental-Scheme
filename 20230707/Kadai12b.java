// 2023年07月07日

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai12b {
    int n;

    public static void main(String[] args) {
        Kadai12b gui = new Kadai12b();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 内部クラスのオブジェクトを作成
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int n = 5; n <= 50; n++) {
            this.n = n;
            drawPanel.repaint();

            try {
                // 少し遅延させる
                Thread.sleep(100);
            } catch (Exception e) {}
        }

        for (int n = 50; n >= 5; n--) {
            this.n = n;
            drawPanel.repaint();

            try {
                // 少し遅延させる
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.blue);

            MyPolygon polygon = new MyPolygon(150, 150, 100, n);
            polygon.draw(g);
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
