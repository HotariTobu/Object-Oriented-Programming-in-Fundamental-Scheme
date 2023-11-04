// 2023年07月14日

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BlueCircle {
    int w, h;
    int x, y, vx, vy, r;

    public BlueCircle(int w, int h) {
        this.w = w;
        this.h = h;

        x = urand(300) + w / 4;
        y = urand(200) + h / 4;

        vx = 5;
        vy = 3;
        r = 30;
    }

    public BlueCircle(int w, int h, int r) {
        this(w, h);

        this.r = r;
    }

    public void update() {
        x += vx;
        y += vy;

        if (x - r < 50) {
            x -= vx;
            vx = -vx;
        }

        if (x + r > w - 50) {
            x -= vx;
            vx = -vx;
        }

        if (y - r < 50) {
            y -= vy;
            vy = -vy;
        }

        if (y + r > h - 50) {
            y -= vy;
            vy = -vy;
        }
    }

    int urand(int m) {
        return (int)(Math.random() * m);
    }

    void disp(Graphics g) {
        g.setColor(Color.blue);
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
    }
}

public class Kadai13b {
    JButton button;
    JButton smallButton;

    public static void main(String[] args) {
        Kadai13b gui = new Kadai13b();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Add a Ball");
        smallButton = new JButton("Add a Small Ball");
        MyDrawPanel drawPanel = new MyDrawPanel();
        button.addActionListener(drawPanel);
        smallButton.addActionListener(drawPanel);

        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(smallButton, BorderLayout.NORTH);
        frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel implements ActionListener {
        ArrayList<BlueCircle> al;
        javax.swing.Timer time;

        public MyDrawPanel() {
            al = new ArrayList<BlueCircle>();
            time = new javax.swing.Timer(20, this);
            time.start();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                BlueCircle c = new BlueCircle(getWidth(), getHeight());
                al.add(c);
            }
            if (e.getSource() == smallButton) {
                BlueCircle c = new BlueCircle(getWidth(), getHeight(), 15);
                al.add(c);
            }
            else {
                repaint();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.blue);
            g.drawRect(50, 50, getWidth() - 100, getHeight() - 100);

            Iterator<BlueCircle> it = al.iterator();
            while(it.hasNext()) {
                BlueCircle c = it.next();
                c.update();
                c.disp(g);
            }
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
