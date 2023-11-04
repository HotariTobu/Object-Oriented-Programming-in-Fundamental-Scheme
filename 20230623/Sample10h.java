// 2023年06月23日

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample10g {
    public static void main(String[] args) {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("output.dat")));

            pw.print("Hello! ");
            pw.println("GoodBye");
            pw.close();
        } catch (IOException e) {
            System.out.println("例外発生：" + e);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}

/*
 * 実行結果 ********************************************************
 *******************************************************************/
