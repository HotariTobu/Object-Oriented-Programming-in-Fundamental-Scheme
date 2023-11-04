// 2023年07月21日

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample14a {
    public static void main(String[] args) {
        Sample14a gui = new Sample14a();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 内部クラスのオブジェクトを作成
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel {
        int x1 = 10;
        int y1 = 10;

        int x2 = 200;
        int y2 = 200;

        public MyDrawPanel() {
            addMouseMotionListener(
                new MouseMotionListener() {
                    @Override
                    public void mouseMoved(MouseEvent e) {
                        x1 = e.getX();
                        y1 = e.getY();

                        repaint();
                    }

                    @Override
                    public void mouseDragged(MouseEvent e) {
                        x2 = e.getX();
                        y2 = e.getY();

                        repaint();
                    }
                }
            );
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.blue);
            g.fillRect(x1, y1, 30, 30);

            g.setColor(Color.red);
            g.fillOval(x2, y2, 30, 30);
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
