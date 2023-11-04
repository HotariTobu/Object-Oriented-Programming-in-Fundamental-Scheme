// 2023年06月30日

public class Sample11b implements Runnable {
    public static void main(String[] args) {
        Sample11b sp = new Sample11b();

        Thread th = new Thread(sp);
        th.start();
        // sp.run();

        for (int j = 0; j < 10; j++) {
            System.out.println("main: j = " + j);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run: i = " + i);
        }
    }
}

/* 実行結果 ********************************************************
main: j = 0
run: i = 0
main: j = 1
run: i = 1
main: j = 2
run: i = 2
main: j = 3
run: i = 3
main: j = 4
run: i = 4
main: j = 5
run: i = 5
main: j = 6
run: i = 6
main: j = 7
run: i = 7
main: j = 8
run: i = 8
main: j = 9
run: i = 9
*******************************************************************/
