// 2023年06月30日

public class PrintTask implements Runnable {
    private int interval;
    private String mes;

    public PrintTask(int interval, String mes) {
        this.interval = interval;
        this.mes = mes;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(mes);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
