// 2023年06月02日

public class Kadai07d {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};
        int[] b = a;

        b[2] = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int n : b) {
            System.out.print(n + " ");
        }
    }
}

/* 実行結果 ********************************************************
3 4 0 6 7
3 4 0 6 7
*******************************************************************/
