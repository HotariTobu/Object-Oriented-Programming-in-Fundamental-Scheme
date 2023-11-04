// 2023年04月21日

public class Kadai02a {
    // mainメソッド
    public static void main(String[] args) {
        // Dice型のオブジェクトを作成してdに代入する
        Dice d = new Dice();


        // メソッドを使って、フィールドnに1を代入する
        d.setN(1);

        // メソッドを使って、フィールドsizeに"L"を代入する
        d.setSize("L");


        // メソッドを使ってnの値を取得して表示する
        System.out.println("n = " + d.getN());

        // メソッドを使ってsizeの値を取得して表示する
        System.out.println("size = " + d.getSize());


        // サイコロを振る
        d.play();


        // メソッドを使ってnの値を取得して表示する
        System.out.println("n = " + d.getN());

        // メソッドを使ってsizeの値を取得して表示する
        System.out.println("size = " + d.getSize());
    }
}

/* 実行結果 ********************************************************
n = 1
size = L
n = 3
size = L
*******************************************************************/
