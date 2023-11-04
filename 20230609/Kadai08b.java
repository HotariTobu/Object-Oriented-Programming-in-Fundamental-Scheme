// 2023年06月09日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai08b extends JFrame {
    private SamplePanel sp;
    private Shape currentShape = null;

    public static void main(String[] args) {
        Kadai08b sm = new Kadai08b();
    }

    public Kadai08b() {
        super("Kadai08b");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        sp = new SamplePanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class SamplePanel extends JPanel {
        private ArrayList<Shape> shapelist = new ArrayList<Shape>();

        public SamplePanel() {
            addMouseListener(new SampleMouseListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Iterator<Shape> it = shapelist.iterator();
            while (it.hasNext()) {
                Shape sh = it.next();
                sh.draw(g);
            }
        }

        public class SampleMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                if (currentShape == null || currentShape instanceof Rectangle) {
                    currentShape = new Circle(e.getX(), e.getY());
                }
                else {
                    currentShape = new Rectangle(e.getX(), e.getY());
                }

                shapelist.add(currentShape);
                repaint();
            }
        }
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
