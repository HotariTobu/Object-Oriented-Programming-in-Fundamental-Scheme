// 2023年05月19日

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kadai05d extends JFrame {
    private MyPanel sp;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kadai05d sm = new Kadai05d();

        while (true) {
            // mを入力させる
            System.out.println("サイズを入力");

            try {
                m = sc.nextInt();
                sm.repaint();
            } catch (Exception e) {
                sm.dispose();
                break;
            }
        }

        sc.close();
    }

    public Kadai05d() {
        super("Kadai05d");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);

        sp = new MyPanel();
        add(sp, BorderLayout.CENTER);

        setVisible(true);
    }

    public class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 2次元配列aを用意する
            // 奇数ならtrue、偶数ならfalse
            boolean[][] a = new boolean[m][m];

            // a[n][k]が組み合わせの数nCkになるように計算する
            for (int n = 0; n < a.length; n++) {
                a[n][0] = true;

                for (int k = 1; k <= n; k++) {
                    a[n][k] = a[n - 1][k - 1] ^ a[n - 1][k];
                }
            }

            Dimension size = getSize();

            int cellWidth = (int) (size.getWidth() / m);
            int cellHeight = (int) (size.getHeight() / m);
            int cellSize = Math.min(cellWidth, cellHeight);

            // m×mの正方形の格子を描画する
            for (int n = 0; n < m; n++) {
                for (int k = 0; k < m; k++) {
                    int x = cellSize * k;
                    int y = cellSize * n;

                    if (a[n][k]) {
                        g.fillRect(x, y, cellSize, cellSize);
                    } else {
                        g.drawRect(x, y, cellSize, cellSize);
                    }
                }
            }
        }
    }
}

/*
 * 実行結果 ********************************************************
 *******************************************************************/
