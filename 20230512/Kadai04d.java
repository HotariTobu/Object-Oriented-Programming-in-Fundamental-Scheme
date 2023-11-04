// 2023年05月12日

public class Kadai04d {
    public static void main(String[] args) {
        System.out.println("args.lengthの値は" + args.length);
        for (String s : args) {
            System.out.println(s);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        System.out.println("積は" + a * b);
    }
}

/* 実行結果 ********************************************************
args.lengthの値は3
This
is
good
*******************************************************************/

/* 実行結果 ********************************************************
args.lengthの値は2
1.2
11
積は13.2
*******************************************************************/
