import java.awt.BorderLayout;

// 2023年05月26日

import java.awt.BorderLayout;

public class Kadai06f {
    public static void main(String[] args) {
        KadaiFrame frame = new KadaiFrame("06f");

        // アンモナイトの図を描く
        IFSPanel AmmonitesPanel = new IFSPanel(new Vector2(0.5, 0.5));
        AmmonitesPanel.addFunction(
            new Matrix2x2(-0.29, 0, 0, 0.2),
            new Vector2(0.94, 0.24),
            6
        );
        AmmonitesPanel.addFunction(
            new Matrix2x2(-0.07, -0.02, -0.01, 0.29),
            new Vector2(0.94, 0.33),
            2
        );
        AmmonitesPanel.addFunction(
            new Matrix2x2(0.94, -0.22, 0.21, 0.96),
            new Vector2(0.115, -0.08),
            92
        );

        frame.add(AmmonitesPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
