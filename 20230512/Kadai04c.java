// 2023年05月12日

public class Kadai04c {
    public static void main(String[] args) {
        HealthRecord[] healthRecords = new HealthRecord[4];
        healthRecords[0] = new HealthRecord(157, 56);
        healthRecords[1] = new HealthRecord(185);
        healthRecords[2] = new HealthRecord("鈴木", 165.5, 75.5);
        healthRecords[3] = new HealthRecord();

        for (HealthRecord healthRecord : healthRecords) {
            System.out.println(healthRecord);
        }
    }
}

/* 実行結果 ********************************************************
データなし/157.0/56.0
データなし/185.0/60.0
鈴木/165.5/75.5
データなし/170.0/60.0
*******************************************************************/
