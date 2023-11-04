// 2023年06月30日

public class Sample11a extends Thread {
    public static void main(String[] args) {
        Sample11a sp = new Sample11a();
        sp.start();
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
main: i = 0
main: j = 1
main: i = 1
main: j = 2
main: i = 2
main: j = 3
main: i = 3
main: j = 4
main: i = 4
main: i = 5
main: j = 5
main: i = 6
main: j = 6
main: i = 7
main: j = 7
main: i = 8
main: j = 8
main: i = 9
main: j = 9
*******************************************************************/
