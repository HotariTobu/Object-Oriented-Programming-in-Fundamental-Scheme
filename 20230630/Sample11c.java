// 2023年06月30日

public class Sample11c implements Runnable {
    public static void main(String[] args) {
        Sample11c sp = new Sample11c();

        Thread th = new Thread(sp);
        th.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("main1: j = " + j);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("main2: j = " + j);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run: i = " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/* 実行結果 ********************************************************
main1: j = 0
run: i = 0
main1: j = 1
run: i = 1
main1: j = 2
main1: j = 3
run: i = 2
main1: j = 4
main1: j = 5
run: i = 3
main1: j = 6
main1: j = 7
run: i = 4
main1: j = 8
main1: j = 9
run: i = 5
run: i = 6
run: i = 7
run: i = 8
run: i = 9
main2: j = 0
main2: j = 1
main2: j = 2
main2: j = 3
main2: j = 4
main2: j = 5
main2: j = 6
main2: j = 7
main2: j = 8
main2: j = 9
*******************************************************************/
