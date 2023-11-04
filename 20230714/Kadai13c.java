// 2023年07月14日

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kadai13c {
    public static void main(String[] args) {
        Kadai13c gui = new Kadai13c();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 内部クラスのオブジェクトを作成
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(356, 400);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel implements ActionListener {
        String[] fn = {
            "img1.JPG",
            "img2.JPG",
            "img3.JPG",
            "img4.JPG",
        };

        ImageIcon[] imgs;

        int k = 0;
        int n = fn.length;
        Timer time;

        public MyDrawPanel() {
            imgs = new ImageIcon[fn.length];

            for (int i = 0; i < fn.length; i++) {
                imgs[i] = new ImageIcon(fn[i]);
            }

            time = new Timer(1000, this);
            time.start();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            k = (k + 1) % n;
            System.out.println("k=" + k);
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(imgs[k].getImage(), 40, 50, this);
        }
    }
}

/* 実行結果 ********************************************************
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230714$ java Kadai13c
k=1
k=2
k=3
k=0
k=1
k=2
k=3
k=0
*******************************************************************/
