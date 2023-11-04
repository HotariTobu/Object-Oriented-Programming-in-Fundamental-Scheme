public class Test01b {
    public static void main(String args[]) {
        double sumArea = 0;

        MyRing ring = new MyRing(5, 5, 5);

        for (int i = 0; i < 20; i++) {
            double r = ring.getR();
            double cx = ring.getX();

            System.out.println(cx);

            sumArea += ring.areaRing();
            System.out.println(sumArea);

            double newR = r * 0.8;
            double newCx = cx + r + newR;

            if (newCx + newR > 44) {
                break;
            }

            ring = new MyRing(newCx, newR, newR);
        }

        System.out.println(sumArea);
    }
}

/* 実行結果 ***********************************************************
fise187@ISE14u:~$ java Test01b
5.0
14.0
21.2
26.96
31.568000000000005
35.254400000000004
38.203520000000005
40.562816000000005
42.4502528
322.4593862710009
**********************************************************************/
