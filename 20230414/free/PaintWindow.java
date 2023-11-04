// 2023年04月14日

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PaintWindow extends JFrame {
    public PaintWindow() {
        super("お絵描き");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        Canvas canvas = new Canvas();
        add(canvas, BorderLayout.CENTER);

        System.out.println("Window");

        setVisible(true);
    }
}
