// 2023年06月23日

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kadai10b {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("使用法：java Kadai10b file1 file2 file3");
            return;
        }

        Scanner sc1 = null;
        Scanner sc2 = null;

        PrintWriter pw = null;

        try {
            sc1 = new Scanner(new File(args[0]));
            sc2 = new Scanner(new File(args[1]));

            pw = new PrintWriter(args[2]);

            // 1つ目のファイルの内容を3つ目のファイルに書き込む
            // 次の行があるかどうかチェック
            while (sc1.hasNextLine()) {
                // nextLine()で次の行を読み込む
                pw.println(sc1.nextLine());
            }

            // 2つ目のファイルの内容を3つ目のファイルに書き込む
            // 次の行があるかどうかチェック
            while (sc2.hasNextLine()) {
                // nextLine()で次の行を読み込む
                pw.println(sc2.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("例外発生：" + e);
        }
        finally {
            if (sc1 != null) {
                sc1.close();
            }

            if (sc2 != null) {
                sc2.close();
            }

            if (pw != null) {
                pw.close();
            }
        }
    }
}

/* 実行結果 ********************************************************
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230623$ java Kadai10b
使用法：java Kadai10b file1 file2 file3
2XXXXX1@ISE14u:~/Object-Oriented-Programming-in-Fundamental-Scheme/20230623$ java Kadai10b test.dat output.dat outbut2.dat
*******************************************************************/
