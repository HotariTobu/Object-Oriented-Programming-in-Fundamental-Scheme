// 2023年06月30日

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai11x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JFrame frame = new KadaiFrame("11x");
        SuperSquarePanel panel = new SuperSquarePanel();
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        while (true) {
            System.out.print("Max Depth: ");

            try {
                int maxDepth = sc.nextInt();
                int length = panel.updateMaxDepth(maxDepth);
                frame.setSize(length, length + 50);
            } catch (Exception e) {
                frame.dispose();
                break;
            }
        }

        sc.close();
    }
}

class SuperSquarePanel extends JPanel {
    private final int HALF_SIZE = 64;

    private int maxDepth;
    private int center;

    public int updateMaxDepth(int maxDepth) throws InvalidParameterException {
        if (maxDepth < 0) {
            throw new InvalidParameterException("Param must be positive: maxDepth");
        }

        this.maxDepth = maxDepth;

        int extraSize = (int)(HALF_SIZE * (2 - Math.pow(1.0 / 2, maxDepth)));
        center = HALF_SIZE + extraSize;

        int length = (HALF_SIZE + extraSize) * 2;

        repaint();
        return length;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Square rootSquare = new Square();
        rootSquare.centerX = center;
        rootSquare.centerY = center;
        rootSquare.halfSize = HALF_SIZE;

        SquareItem rootItem = new SquareItem();
        rootItem.square = rootSquare;
        rootItem.from = -4;
        rootItem.depth = 0;

        Stack<SquareItem> stack = new Stack<SquareItem>();
        stack.push(rootItem);

        while (!stack.empty()) {
            SquareItem parentItem = stack.pop();
            parentItem.square.draw(g);

            int parentDepth = parentItem.depth;
            if (parentDepth >= maxDepth) {
                continue;
            }
            int childDepth = parentDepth + 1;

            int parentX = parentItem.square.centerX;
            int parentY = parentItem.square.centerY;

            int parentHalfSize = parentItem.square.halfSize;
            int childHalfSize = parentHalfSize / 2;
            int centerDiff = parentHalfSize + childHalfSize;

            int skipDirection = (parentItem.from + 2) % 4;
            for (int i = 0; i < 4; i++) {
                if (i == skipDirection) {
                    continue;
                }

                int signX = i % 3 == 0 ? -1 : 1;
                int signY = i < 2 ? -1 : 1;

                int childX = parentX + centerDiff * signX;
                int childY = parentY + centerDiff * signY;

                Square childSquare = new Square();
                childSquare.centerX = childX;
                childSquare.centerY = childY;
                childSquare.halfSize = childHalfSize;

                SquareItem childItem = new SquareItem();
                childItem.square = childSquare;
                childItem.from = i;
                childItem.depth = childDepth;

                stack.push(childItem);
            }
        }
    }
}

class Square {
    public int centerX;
    public int centerY;

    public int halfSize;

    public void draw(Graphics g) {
        int size = halfSize * 2;
        g.drawRect(centerX - halfSize, centerY - halfSize, size, size);
    }
}

class SquareItem {
    public Square square;
    public int from;
    public int depth;
}

/* 実行結果 ********************************************************

*******************************************************************/
