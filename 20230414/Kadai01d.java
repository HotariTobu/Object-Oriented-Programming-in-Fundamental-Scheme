// 2023年04月14日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kadai01d extends JFrame {
    private SamplePanel sp;

    public static void main(String[] args) {
        Kadai01d sm = new Kadai01d();
    }

    public Kadai01d() {
        super("Kadai01d");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        sp = new SamplePanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class SamplePanel extends JPanel {
        private ArrayList<RedCircle> circleList = new ArrayList<RedCircle>();

        public SamplePanel() {
            addMouseListener(new SampleMouseListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Iterator<RedCircle> it = circleList.iterator();
            while (it.hasNext()) {
                RedCircle c = it.next();
                c.draw(g);
            }
        }

        public class SampleMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                circleList.add(new RedCircle(e.getX(), e.getY()));
                repaint();
            }
        }
    }
}
