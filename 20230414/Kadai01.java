// 2023年04月14日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kadai01 extends JFrame {
    private SamplePanel sp;

    public static void main(String[] args) {
        Kadai01 sm = new Kadai01();
    }

    public Kadai01() {
        // super("Kadai01b");
        super("Kadai01"); // (3) ウィンドウのタイトルがKadai01になるように

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(300, 300);
        setSize(500, 500); // ウィンドウのサイズが大きくなるように

        sp = new SamplePanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class SamplePanel extends JPanel {
        private ArrayList<Circle> circleList = new ArrayList<Circle>();

        public SamplePanel() {
            addMouseListener(new SampleMouseListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Iterator<Circle> it = circleList.iterator();
            while (it.hasNext()) {
                Circle c = it.next();
                c.draw(g);
            }
        }

        public class SampleMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                circleList.add(new Circle(e.getX(), e.getY()));
                repaint();
            }
        }
    }
}
