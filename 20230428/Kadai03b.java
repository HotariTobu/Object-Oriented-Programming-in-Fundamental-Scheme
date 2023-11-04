// 2023年04月28日

public class Kadai03b {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1, 1);
        t.show();
        System.out.println("area()=" + t.area());

        t.setValues(3, 4, 5);
        t.show();
        System.out.println("area()=" + t.area());
    }
}

/* 実行結果 ********************************************************
a=1.0, b=1.0, c=1.0
area()=0.4330127018922193
a=3.0, b=4.0, c=5.0
area()=6.0
*******************************************************************/
