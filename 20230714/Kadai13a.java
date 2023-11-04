// 2023年07月14日

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai13a {
    public static void main(String[] args) {
        Kadai13a gui = new Kadai13a();
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
        String[] s = {
            "Photo-A",
            "Photo-B",
            "Photo-C",
            "Photo-D",
        };
        String[] fn = {
            "img1.JPG",
            "img2.JPG",
            "img3.JPG",
            "img4.JPG",
        };

        JButton[] button;
        ImageIcon[] imgs;

        Font ft;
        int k = 0;

        public MyDrawPanel() {
            imgs = new ImageIcon[fn.length];

            for (int i = 0; i < fn.length; i++) {
                imgs[i] = new ImageIcon(fn[i]);
            }

            ft = new Font("", Font.BOLD, 20);
            button = new JButton[s.length];
            for (int i = 0; i < s.length; i++) {
                button[i] = new JButton(s[i]);
                button[i].setFont(ft);
                button[i].addActionListener(this);
                add(button[i]);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(imgs[k].getImage(), 40, 90, this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            int i;
            for (i = 0; i < s.length; i++) if (s[i] == cmd) break;
            k = i;
            System.out.println(cmd);
            repaint();
        }
    }
}

/* 実行結果 ********************************************************
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230714$ java Kadai13a
Photo-B
Photo-C
Photo-D
*******************************************************************/
