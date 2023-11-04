// 2023年05月26日

import java.awt.BorderLayout;

public class Kadai06e {
    public static void main(String[] args) {
        KadaiFrame frame = new KadaiFrame("06e");

        // コッホ曲線を描く
        IFSPanel KochCurvePanel = new IFSPanel(new Vector2(0, 0));
        KochCurvePanel.addFunction(
            new Matrix2x2(0.5, 0.288675, 0.288675, -0.5),
            new Vector2(0, 0)
        );
        KochCurvePanel.addFunction(
            new Matrix2x2(-0.5, -0.288675, 0.288675, -0.5),
            new Vector2(1, 0)
        );

        frame.add(KochCurvePanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
