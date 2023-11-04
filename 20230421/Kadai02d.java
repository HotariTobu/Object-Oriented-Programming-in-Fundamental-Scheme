// 2023年04月21日

public class Kadai02d {
    public static void main(String[] args) {
        System.out.println("---wrapperクラスを利用---");

        // wrapperクラスのByteクラスは
        // フィールドMIN_VALUEとMAX_VALUEを持つ
        System.out.println("byte min:" + Byte.MIN_VALUE + ", max:" + Byte.MAX_VALUE);

        // 最小値を最大値を出力する
        System.out.println("short min:" + Short.MIN_VALUE + ", max:" + Short.MAX_VALUE);
        System.out.println("int min:" + Integer.MIN_VALUE + ", max:" + Integer.MAX_VALUE);
        System.out.println("long min:" + Long.MIN_VALUE + ", max:" + Long.MAX_VALUE);
        System.out.println("float min:" + Float.MIN_VALUE + ", max:" + Float.MAX_VALUE);
        System.out.println("double min:" + Double.MIN_VALUE + ", max:" + Double.MAX_VALUE);

        System.out.println("---シフト演算子を利用---");

        byte b_min = (byte)(1 << 7);
        byte b_max = (byte)((1 << 7) - 1);

        short s_min = (short)(1 << 15);
        short s_max = (short)((1 << 15) - 1);
        int i_min = (1 << 31);
        int i_max = ((1 << 31) - 1);
        long l_min = (1L << 63);
        long l_max = ((1L << 63) - 1);

        System.out.println("byte min:" + b_min + ", max:" + b_max);
        System.out.println("short min:" + s_min + ", max:" + s_max);
        System.out.println("int min:" + i_min + ", max:" + i_max);
        System.out.println("long min:" + l_min + ", max:" + l_max);
    }
}

/* 実行結果 ********************************************************
---wrapperクラスを利用---
byte min:-128, max:127
short min:-32768, max:32767
int min:-2147483648, max:2147483647
long min:-9223372036854775808, max:9223372036854775807
float min:1.4E-45, max:3.4028235E38
double min:4.9E-324, max:1.7976931348623157E308
---シフト演算子を利用---
byte min:-128, max:127
short min:-32768, max:32767
int min:-2147483648, max:2147483647
long min:-9223372036854775808, max:9223372036854775807
*******************************************************************/
