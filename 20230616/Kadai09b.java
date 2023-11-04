// 2023年06月16日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kadai09b extends JFrame {
    public static void main(String[] args) {
        new Kadai09b();
    }

    public Kadai09b() {
        super("Kadai09b");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);

        add(new MyPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    public class MyPanel extends JPanel {
        public MyPanel() {
            super();

            // 時計を更新する
            ActionListener updater = new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    repaint();
                }
            };
            new Timer(900, updater).start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            MySuper[] ms = new MySuper[6];

            // 時計を追加する
            ms[0] = new MyClock(100, 100, 80, "Asia/Tokyo");
            ms[1] = new MyClock(300, 100, 80, "Europe/London");
            ms[2] = new MyClock(500, 100, 80, "America/Chicago");

            // 正多角形を追加する
            ms[3] = new MyPolygon(100, 400, 80, 10);
            ms[4] = new MyPolygon(300, 400, 80, 15);
            ms[5] = new MyPolygon(500, 400, 80, 20);

            for (MySuper s : ms) {
                s.draw(g);

                if (s instanceof Printable) {
                    Printable p = (Printable)s;
                    p.print(g);
                }
            }
        }
    }
}

/*
 * 実行結果 ********************************************************
 *
 *******************************************************************/
