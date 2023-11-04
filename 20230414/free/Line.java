// 2023年04月14日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Line {
    private ArrayList<Point> pointList;

    public Line() {
        pointList = new ArrayList<Point>();
    }

    public void add(int x, int y) {
        Point point = new Point(x, y);
        pointList.add(point);

        System.out.println(x + ", " + y);
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);

        if (pointList.size() < 2) {
            return;
        }

        Iterator<Point> it = pointList.iterator();
        Point lastPoint = it.next();

        while (it.hasNext()) {
            Point point = it.next();

            g.drawLine(lastPoint.getX(), lastPoint.getY(), point.getX(), point.getY());

            lastPoint = point;
        }
    }
}
