// 2023年07月14日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai13d {
    public static void main(String[] args) {
        Kadai13d gui = new Kadai13d();
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

    class MyDrawPanel extends JPanel implements MouseListener, MouseMotionListener {
        private ImageIcon image;

        private int x;
        private int y;
        private int w = 50;
        private int h;

        public MyDrawPanel() {
            addMouseListener(this);
            addMouseMotionListener(this);

            image = new ImageIcon("img1.JPG");
            int w = image.getIconWidth();
            int h = image.getIconHeight();

            x = -w;
            y = -h;

            this.h = this.w * h / w;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(image.getImage(), x, y, w, h, this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            update(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseDragged(MouseEvent e) {
            update(e);
        }

        @Override
        public void mouseMoved(MouseEvent e) {}

        private void update(MouseEvent e) {
            x = e.getX();
            y = e.getY();

            repaint();
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
