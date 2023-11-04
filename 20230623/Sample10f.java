import java.io.File;
import java.util.Scanner;

public class Sample10f {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(new File("test.dat"));
            
            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                System.out.println(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }

        System.out.println("実行終了");
    }
}

/* 実行結果 ********************************************************
java.io.FileNotFoundException: test.dat (そのようなファイルやディレクトリはありません)
at java.base/java.io.FileInputStream.open0(Native Method)
at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
at java.base/java.util.Scanner.<init>(Scanner.java:639)
at Sample10f.main(Sample10f.java:9)
実行終了
*******************************************************************/