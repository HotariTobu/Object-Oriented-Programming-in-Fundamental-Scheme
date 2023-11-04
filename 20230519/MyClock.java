// 2023年05月19日

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.function.BiConsumer;

// 時計を描画する
public class MyClock {
    // 時計の中心のx座標
    private int cx;

    // 時計の中心のy座標
    private int cy;

    // 時計の半径
    private int radius;

    // タイムゾーンを表す文字列
    private String country;

    public MyClock(int cx, int cy, int radius, String country) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.country = country;
    }

    // 時計の下に`country`の文字列を表示する
    public void print(Graphics g) {
        // 文字列が描画されたときの幅を取得する
        FontMetrics fontMetrics = g.getFontMetrics();
        Rectangle2D rectangle = fontMetrics.getStringBounds(country, g);

        int width = (int) rectangle.getWidth();
        int height = (int) rectangle.getHeight();

        // 描画する
        int x = cx - width / 2;
        int y = cy + radius + height;

        g.setColor(Color.BLACK);
        g.drawString(country, x, y);
    }

    // 時計を描画する
    public void draw(Graphics g) {
        final double MajorDif = Math.PI / 6;
        final double MinorDif = Math.PI / 30;

        final double BaseRadius = -Math.PI / 2;

        // 時計の土台を描画する

        final int MajorSize = 10;
        final int MinorSize = 4;

        // 指定した角の位置に指定した大きさの円を描画する
        BiConsumer<Double, Integer> plotCircle = (radian, size) -> {
            int x = (int) (Math.cos(radian) * radius);
            int y = (int) (Math.sin(radian) * radius);

            int halfSize = size / 2;

            g.fillOval(x - halfSize + cx, y - halfSize + cy, size, size);
        };

        g.setColor(Color.BLACK);

        for (int majorAngle = 0; majorAngle <= 6; majorAngle++) {
            double majorRadian = majorAngle * MajorDif;
            int majorAngle5 = majorAngle * 5;

            plotCircle.accept(majorRadian, MajorSize);
            plotCircle.accept(-majorRadian, MajorSize);

            for (int minorAngle = 0; minorAngle < 5; minorAngle++) {
                double minorRadian = (majorAngle5 + minorAngle) * MinorDif;

                plotCircle.accept(minorRadian, MinorSize);
                plotCircle.accept(-minorRadian, MinorSize);
            }
        }

        // 時計の針を描画する
        double HourRadius = radius * 0.4;
        double MinuteRadius = radius * 0.8;
        double SecondRadius = radius * 0.9;

        Calendar cl = Calendar.getInstance();
        TimeZone tz = TimeZone.getTimeZone(country);
        cl.setTimeZone(tz);

        double hourRadian = MajorDif * cl.get(Calendar.HOUR);
        double minuteRadian = MinorDif * cl.get(Calendar.MINUTE);
        double secondRadian = MinorDif * cl.get(Calendar.SECOND);

        hourRadian += minuteRadian / 12;
        minuteRadian += secondRadian / 60;

        // 指定した角の方向にに指定した長さの線分を描画する関数
        BiConsumer<Double, Double> drawLine = (radian, radius) -> {
            int x = (int) (Math.cos(radian) * radius);
            int y = (int) (Math.sin(radian) * radius);

            g.drawLine(cx, cy, cx + x, cy + y);
        };

        g.setColor(Color.RED);
        drawLine.accept(BaseRadius + hourRadian, HourRadius);

        g.setColor(Color.GREEN);
        drawLine.accept(BaseRadius + minuteRadian, MinuteRadius);

        g.setColor(Color.BLUE);
        drawLine.accept(BaseRadius + secondRadian, SecondRadius);
    }
}
