// 2023年06月02日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kadai07c extends JFrame {
    public static void main(String[] args) {
        new Kadai07c();
    }

    public Kadai07c() {
        super("Kadai07c");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);

        add(new MyPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    public class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            MyPolygon[] p = new MyPolygon[3];
            p[0] = new MyPolygon(100, 100, 80, 10);
            p[1] = new MyPolygon(300, 100, 80, 15);
            p[2] = new MyPolygon(500, 100, 80, 20);

            for (MyPolygon a : p) {
                a.draw(g);
            }
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
