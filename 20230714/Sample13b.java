import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sample13b {
    public static void main(String[] args) throws Exception {
        JLabel label = new JLabel("java2s.com");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 10, 10, 10));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}
