// 2023年07月21日

/*
 * <applet code="Sample14b.class" width=600 height=400>
 * </applet>
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Sample14b extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(10, 10, 300, 100);
        g.setColor(Color.blue);
        g.fillOval(300, 100, 100, 50);
        g.setColor(Color.black);
        g.setFont(new Font("Serif", Font.ITALIC, 48));
        g.drawString("Applet 使用例", 200, 300);
    }
}
