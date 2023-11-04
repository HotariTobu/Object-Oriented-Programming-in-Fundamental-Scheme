// 2023年07月21日

import java.io.File;
import java.util.Scanner;

public class Kadai14c {
    public static void main(String[] args) throws Exception {
        // 文字コードを指定してファイルを操作する
        Scanner sc = new Scanner(new File("pro_input.dat"), "UTF-8");
        String search_str = "プログラム";
        String insert_str1 = "program (";
        String insert_str2 = ")";

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            // 最初に現れる場所
            int idx1 = str.indexOf(search_str);

            // 指定した文字列が存在すれば
            if (idx1 >= 0) {
                StringBuffer sb = new StringBuffer(str);

                int idx2 = idx1 + insert_str1.length() + search_str.length();

                // 文字列を挿入
                sb.insert(idx1, insert_str1);
                sb.insert(idx2, insert_str2);

                System.out.println(sb);
            }
        }

        sc.close();
    }
}

/* 実行結果 ********************************************************
かつてのコンピュータでは、処理の手順を表すよう電気的配線を行うことによって、program (プログラム)が作成された。
これをワイヤードロジック（結線論理）方式という。この方法では、実行するprogram (プログラム)を変更するたびに、配線の変更作業が必要となった。
一方現在では、program (プログラム)内蔵方式が主流となっている。
program (プログラム)を作ることをプログラミングと言い、プログラミング作業をする人をプログラマという。
program (プログラム)の作成には、まずコンピュータによる処理の手順を表にしたものを作成し、この手順書をアルゴリズムと呼ぶ。
これらを用いて記述されたprogram (プログラム)の設計図をソースコードと呼ぶ。
ソースコードは、それをコンパイルすることで、機械が解釈できる形のprogram (プログラム)である実行ファイルを得ることができる。
一方、コンパイルすることなく、program (プログラム)を実行できる方式として、インタプリタによる方式がある。
program (プログラム)は、実現する機能によって、コンピュータ自体の動作を制御するオペレーティングシステムなどのシステムソフトウェアと、表計算ソフトなど使用者が目的とする作業そのものを行うアプリケーションソフトウェアに大別される。
*******************************************************************/
