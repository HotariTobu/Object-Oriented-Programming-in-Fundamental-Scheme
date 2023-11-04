// 2023年05月26日

public class Kadai06c {
    public static void main(String[] args) {
        Item[] items = {
            new Item(0, 80),
            new Item(1, 210),
            new Item(2, 100),
        };

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

/* 実行結果 ********************************************************
ノリ：80円
はさみ：210円
定規：100円
*******************************************************************/
