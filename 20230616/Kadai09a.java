// 2023年06月16日

public class Kadai09a {
    public static void main(String[] args) {
        Shipping[] sp = new Shipping[3];
        sp[0] = new Handbag(20011, "ショルダー", 1);
        sp[1] = new Handbag(30022, "リュック", 9);
        sp[2] = new Chair(50001, "スツール");

        System.out.println("商品名\tCODE\t価格\t送料\t手数料");

        for (Shipping s : sp) {
            System.out.print(s.info());
            System.out.print("\t" + s.shipping());
            System.out.println("\t" + s.handling());
        }
    }
}

/* 実行結果 ********************************************************
商品名  CODE    価格    送料    手数料
ショルダー      20011   10000   500     0
リュック        30022   12000   100     200
スツール        50001   12000   1200    200
*******************************************************************/
