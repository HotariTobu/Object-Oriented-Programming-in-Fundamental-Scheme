// 2023年05月19日

import java.util.Scanner;

public class Kadai05c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // mを入力させて2次元配列aを用意する
        int m = sc.nextInt();
        int[][] a = new int[m][m];

        // a[n][k]が組み合わせの数nCkになるように計算する
        for (int n = 0; n < a.length; n++) {
            a[n][0] = 1;

            for (int k = 1; k <= n; k++) {
                a[n][k] = a[n - 1][k - 1] + a[n - 1][k];
            }
        }

        // aを表示する
        for (int[] vs : a) {
            for (int v : vs) {
                System.out.printf("%4d", v);
            }

            System.out.println();
        }

        sc.close();
    }
}

/* 実行結果 ********************************************************
10
   1   0   0   0   0   0   0   0   0   0
   1   1   0   0   0   0   0   0   0   0
   1   2   1   0   0   0   0   0   0   0
   1   3   3   1   0   0   0   0   0   0
   1   4   6   4   1   0   0   0   0   0
   1   5  10  10   5   1   0   0   0   0
   1   6  15  20  15   6   1   0   0   0
   1   7  21  35  35  21   7   1   0   0
   1   8  28  56  70  56  28   8   1   0
   1   9  36  84 126 126  84  36   9   1
*******************************************************************/
