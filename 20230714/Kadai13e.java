// 2023年07月14日

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Kadai13e extends JFrame {
    public static void main(String[] args) {
        new Kadai13e();
    }

    private ArrayList<BlueCircle> blueCircles = new ArrayList<BlueCircle>();

    public Kadai13e() {
        super("Kadai13e");

        getContentPane().add(new MainPanel(), BorderLayout.CENTER);
        getContentPane().add(new SidePanel(), BorderLayout.EAST);

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MainPanel extends JPanel {
        private final int MARGIN = 50;
        private final int INTERVAL = 20;

        public MainPanel() {
            setBackground(Color.white);
            setBorder(new EmptyBorder(MARGIN, MARGIN, MARGIN, MARGIN));
            setLayout(new BorderLayout());

            add(new DrawPanel(), BorderLayout.CENTER);
        }

        private class DrawPanel extends JPanel {
            public DrawPanel() {
                setBorder(new LineBorder(Color.blue));
                setOpaque(false);

                new Timer(INTERVAL, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        repaint();
                    }
                }).start();
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int w = getWidth();
                int h = getHeight();

                for (BlueCircle blueCircle : blueCircles) {
                    blueCircle.update();

                    int x = blueCircle.getX();
                    int y = blueCircle.getY();
                    int r = blueCircle.getR();

                    int diffX1 = r - x;
                    if (diffX1 > 0) {
                        blueCircle.collisionX(diffX1);
                    }

                    int diffX2 = w - x - r;
                    if (diffX2 < 0) {
                        blueCircle.collisionX(diffX2);
                    }

                    int diffY1 = r - y;
                    if (diffY1 > 0) {
                        blueCircle.collisionY(diffY1);
                    }

                    int diffY2 = h - y - r;
                    if (diffY2 < 0) {
                        blueCircle.collisionY(diffY2);
                    }

                    blueCircle.draw(g);
                }
            }
        }
    }

    private class SidePanel extends JPanel {
        private final int X = 300;
        private final int Y = 200;
        private final int DIVIDER = 4;

        private final int VX = 5;
        private final int VY = 3;

        private final int R = 30;
        private final int SMALL_R = 15;

        public SidePanel() {
            setBackground(Color.black);
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            JButton[] buttons = {
                    ButtonFactory.createButton("Add a Ball", e -> addBlueCircle(false)),
                    ButtonFactory.createButton("Add a Small Ball", e -> addBlueCircle(true)),
                    ButtonFactory.createButton("Large", e -> scaleBlueCircles(1.5)),
                    ButtonFactory.createButton("Small", e -> scaleBlueCircles(0.5)),
                    ButtonFactory.createButton("Accelerate", e -> accelerateBlueCircles(1.5)),
                    ButtonFactory.createButton("Decelerate", e -> accelerateBlueCircles(0.5)),
            };

            for (JButton button : buttons) {
                int height = button.getPreferredSize().height;
                Dimension size = new Dimension(Integer.MAX_VALUE, height);
                button.setMaximumSize(size);
                add(button);
            }
        }

        private void addBlueCircle(boolean isSmall) {
            Function<Integer, Integer> randomInt = max -> (int) (Math.random() * max);

            int x = randomInt.apply(X) + getWidth() / DIVIDER;
            int y = randomInt.apply(Y) + getHeight() / DIVIDER;

            int vx = VX;
            int vy = VY;

            int r = isSmall ? SMALL_R : R;

            try {
                BlueCircle blueCircle = new BlueCircle(x, y, vx, vy, r);
                blueCircles.add(blueCircle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void scaleBlueCircles(double ratio) {
            try {
                for (BlueCircle blueCircle : blueCircles) {
                    blueCircle.scale(ratio);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void accelerateBlueCircles(double ratio) {
            try {
                for (BlueCircle blueCircle : blueCircles) {
                    blueCircle.accelerate(ratio);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class ButtonFactory {
        public static JButton createButton(String label, Consumer<ActionEvent> action) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    action.accept(e);
                }
            });

            return button;
        }
    }

    private class BlueCircle {
        private int x;
        private int y;

        private int vx;
        private int vy;

        private int r;

        public BlueCircle(int x, int y, int vx, int vy, int r) throws Exception {
            if (x <= 0 || y <= 0 || vx <= 0 || vy <= 0 || r <= 0) {
                throw new Exception("parameters must be positive");
            }

            this.x = x;
            this.y = y;

            this.vx = vx;
            this.vy = vy;

            this.r = r;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getR() {
            return r;
        }

        public void accelerate(double ratio) throws Exception {
            if (ratio <= 0) {
                throw new Exception("parameter ratio must be positive");
            }

            vx *= ratio;
            vy *= ratio;
        }

        public void scale(double ratio) throws Exception {
            if (ratio <= 0) {
                throw new Exception("parameter ratio must be positive");
            }

            r *= ratio;
        }

        public void update() {
            x += vx;
            y += vy;
        }

        public void collisionX(int diff) {
            x += diff;
            vx = -vx;
        }

        public void collisionY(int diff) {
            y += diff;
            vy = -vy;
        }

        public void draw(Graphics g) {
            g.setColor(Color.blue);
            g.drawOval(x - r, y - r, 2 * r, 2 * r);
        }
    }
}

/*
 * 実行結果 ********************************************************
 *
 *******************************************************************/
