public class Test01a {
    public static void main(String args[]) {
        MyCircle[] mc = new MyCircle[3];
        mc[0] = new MyCircle(5, 5, 4);
        mc[1] = mc[0].resize(2.5);
        mc[2] = mc[0].move(-2.5, -3.5);

        int count = 0;

        for (MyCircle c : mc) {
            System.out.println(c);

            if (c.contain()) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/* 実行結果 ***********************************************************
fise187@ISE14u:~$ java Test01a
(5.0, 5.0) r=4.0
(5.0, 5.0) r=10.0
(2.5, 1.5) r=4.0
2
**********************************************************************/
