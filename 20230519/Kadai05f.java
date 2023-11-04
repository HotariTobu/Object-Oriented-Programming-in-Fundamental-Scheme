// 2023年05月19日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kadai05f extends JFrame {
    public static void main(String[] args) {
        new Kadai05f();
    }

    public Kadai05f() {
        super("Kadai05f");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);

        ClockPanel clockPanel = new ClockPanel();
        add(clockPanel, BorderLayout.CENTER);

        // 時計を更新する
        ActionListener updater = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                clockPanel.repaint();
            }
        };
        new Timer(900, updater).start();

        setVisible(true);
    }

    public class ClockPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            MyClock[] mc = new MyClock[3];
            mc[0] = new MyClock(100, 100, 80, "Asia/Tokyo");
            mc[1] = new MyClock(300, 100, 80, "Europe/London");
            mc[2] = new MyClock(500, 100, 80, "America/Chicago");

            for (MyClock a : mc) {
                a.draw(g);
                a.print(g);
            }
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
