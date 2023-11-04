// 2023年07月07日

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai12c {
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Kadai12c gui = new Kadai12c();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 内部クラスのオブジェクトを作成
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 124; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try {
                // 少し遅延させる
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.blue);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
