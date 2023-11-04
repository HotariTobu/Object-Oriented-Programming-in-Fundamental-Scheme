// 2023年05月12日

import java.security.InvalidParameterException;

public class Kadai04e {
    public static void main(String[] args) {
        if (args.length != 1) {
            String message = "Usage: command float-num";
            throw new InvalidParameterException(message);
        }

        double num = Double.parseDouble(args[0]);

        Range range = new Range();
        range.setMin(50);
        range.setMax(250);

        if (range.isOK(num)) {
            System.out.println("範囲内");
        }
        else {
            System.out.println("範囲外");
        }
    }
}

/* 実行結果 ********************************************************
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 1.2
範囲外
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 50
範囲内
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 150
範囲内
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 249.9999
範囲内
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 249.999999999999999
範囲外
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 249.9999999999999999999999
範囲外
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 250
範囲外
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230512$ java Kadai04e 1000
範囲外
*******************************************************************/
