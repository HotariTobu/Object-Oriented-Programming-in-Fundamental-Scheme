import java.awt.Color;

import javax.swing.*;

public class JLayeredPaneExample extends JFrame {
    public JLayeredPaneExample() {
        super("JLayeredPane JLayeredPaneExample");

        // JLayeredPaneの作成
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        // 背面のJPanel
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setOpaque(true);
        backgroundPanel.setBackground(Color.blue);
        backgroundPanel.setBounds(50, 50, 200, 200);
        layeredPane.setLayer(backgroundPanel, 0);
        layeredPane.add(backgroundPanel);

        // 前面のJPanel
        JPanel foregroundPanel = new JPanel();
        // foregroundPanel.setOpaque(false);
        foregroundPanel.setBackground(Color.red);
        foregroundPanel.setBounds(100, 100, 100, 100);
        layeredPane.setLayer(foregroundPanel, 1);
        layeredPane.add(foregroundPanel);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLayeredPaneExample();
    }
}
