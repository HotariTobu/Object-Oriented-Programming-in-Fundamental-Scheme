// 2023年06月30日

import javax.swing.JFrame;

public class KadaiFrame extends JFrame {
    public KadaiFrame(String id) {
        super("Kadai" + id);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
    }
}
