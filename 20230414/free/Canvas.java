// 2023年04月14日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Canvas extends JPanel {
    private ArrayList<Line> lineList = new ArrayList<Line>();

    public Canvas() {
        LineMouseListener listener = new LineMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        System.out.println("Canvas");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Iterator<Line> it = lineList.iterator();
        while (it.hasNext()) {
            Line line = it.next();
            line.draw(g);
        }
    }

    public class LineMouseListener extends MouseAdapter {
        private Line line = new Line();

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Pressed: " + e.getX() + ", " + e.getY());

            line = new Line();
            line.add(e.getX(), e.getY());

            lineList.add(line);
        }

        // @Override
        // public void mouseMoved(MouseEvent e) {
        //     System.out.println("Moved: " + e.getX() + ", " + e.getY());

        //     line.add(e.getX(), e.getY());
        //     repaint();
        // }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Dragged: " + e.getX() + ", " + e.getY());

            line.add(e.getX(), e.getY());
            repaint();
        }
    }
}
