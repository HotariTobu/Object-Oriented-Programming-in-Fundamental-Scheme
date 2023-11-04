// 2023年07月07日

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai12a {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        Kadai12a gui = new Kadai12a();
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

        for (int i = 0; i < 130; i++) {
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

            // 外部クラス(Kadai12aクラス)のインスタンス変数(x, y)を利用可能
            g.fillOval(x, y, 40, 40);
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
