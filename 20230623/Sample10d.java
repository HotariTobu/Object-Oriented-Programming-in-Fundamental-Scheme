// 2023年06月23日

public class Sample10d {
    public static void main(String[] args) {
        double height = 175.0;
        double weight = -30;
        Bmi b = new Bmi(height, weight);

        try {
            System.out.println(b.value());
        } catch (Exception e) {
            // System.out.println(e);
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

/* 実行結果 ********************************************************
java.lang.Exception: 体重は正です
体重は正です
java.lang.Exception: 体重は正です
        at Bmi.value(Bmi.java:22)
        at Sample10d.main(Sample10d.java:10)
*******************************************************************/
