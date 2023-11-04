// 2023年06月23日

public class Sample10e {
    public static void main(String[] args) {
        double height = 175.0;
        double weight = -30;

        try {
            Bmi2 b = new Bmi2(height, weight);
            System.out.println(b.value());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

/* 実行結果 ********************************************************
java.lang.Exception
null
java.lang.Exception
        at Bmi2.<init>(Bmi2.java:14)
        at Sample10e.main(Sample10e.java:9)
*******************************************************************/
