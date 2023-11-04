// 2023年05月12日

public class Kadai04f {
    public static void main(String[] args) {
        HealthRecord[] healthRecords = new HealthRecord[4];
        healthRecords[0] = new HealthRecord(157, 56);
        healthRecords[1] = new HealthRecord(185);
        healthRecords[2] = new HealthRecord("鈴木", 165.5, 75.5);
        healthRecords[3] = new HealthRecord();

        Range bmiRange = new Range();
        bmiRange.setMin(18.5);
        bmiRange.setMax(25);

        for (HealthRecord healthRecord : healthRecords) {
            String check = "X";
            if (bmiRange.isOK(healthRecord.bmi())) {
                check = "O";
            }

            System.out.println(healthRecord + " --- " + check);
        }
    }
}

/* 実行結果 ********************************************************
データなし/157.0/56.0 --- O
データなし/185.0/60.0 --- X
鈴木/165.5/75.5 --- X
データなし/170.0/60.0 --- O
*******************************************************************/
