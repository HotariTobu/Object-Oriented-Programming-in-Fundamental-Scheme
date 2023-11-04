// 2023年05月26日

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.function.Consumer;

import javax.swing.JPanel;

// 反復関数系の点をプロットする
public class IFSPanel extends JPanel {
    // 関数の要素のリスト
    private ArrayList<Item> items = new ArrayList<Item>();

    // 計算された点の配列
    private Vector2[] ps;

    public IFSPanel(Vector2 p0, int n) {
        ps = new Vector2[n];
        ps[0] = p0;
    }

    public IFSPanel(Vector2 p0) {
        this(p0, 100000);
    }

    // 関数を追加する
    public void addFunction(Matrix2x2 A, Vector2 b, double weight) {
        items.add(new Item(A, b, weight));
        updatePs();
    }

    public void addFunction(Matrix2x2 A, Vector2 b) {
        addFunction(A, b, 1);
    }

    // psを更新する
    private void updatePs() {
        updateThresholds();

        for (int i = 1; i < ps.length; i++) {
            double itemValue = Math.random();

            // 関数を選び
            for (Item item : items) {
                if (itemValue < item.threshold) {
                    // 点を更新する
                    ps[i] = item.A.multiply(ps[i - 1]).add(item.b);
                    break;
                }
            }
        }
    }

    // Item.thresholdを更新する
    private void updateThresholds() {
        double sumWeight = 0;

        for (Item item : items) {
            sumWeight += item.weight;
            item.threshold = sumWeight;
        }

        if (sumWeight == 0) {
            return;
        }

        for (Item item : items) {
            item.threshold /= sumWeight;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = Math.min(getWidth(), getHeight());

        Consumer<Vector2> plot = new Consumer<Vector2>() {
            @Override
            public void accept(Vector2 vector) {
                int x = (int)(vector.getV0() * size);
                int y = (int)(vector.getV1() * size);
                g.drawOval(x, y, 1, 1);
            }
        };

        for (Vector2 p : ps) {
            plot.accept(p);
        }
    }

    // 関数の要素
    private class Item {
        public Matrix2x2 A;
        public Vector2 b;
        // 関数が選ばれる重み
        // この値が大きいほど選ばれやすい
        public double weight;

        // [0, 1]のしきい値
        // この値未満の場合に関数が選ばれる
        public double threshold;

        public Item(Matrix2x2 A, Vector2 b, double weight) {
            this.A = A;
            this.b = b;
            this.weight = weight;
        }
    }
}
