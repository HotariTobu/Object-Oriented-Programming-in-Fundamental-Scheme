// 2023年04月21日

public class Kadai02b {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setValues(1, 1, 1);
        t1.show();
        System.out.println("area()=" + t1.area());

        Triangle t2 = new Triangle();
        t2.setValues(3, 4, 5);
        t2.show();
        System.out.println("area()=" + t2.area());
    }
}

/* 実行結果 ********************************************************
a=1.0, b=1.0, c=1.0
area()=0.4330127018922193
a=3.0, b=4.0, c=5.0
area()=6.0
*******************************************************************/
