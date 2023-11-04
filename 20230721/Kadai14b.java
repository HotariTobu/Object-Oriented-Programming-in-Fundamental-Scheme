// 2023年07月21日

public class Kadai14b {
    public static void main(String[] args) {
        Book progC = new Book("明快 C 言語", "2200 円", "柴田望洋", "abc@xyz.com");
        Book progJava = new Book("やさしい Java", "2600 円", "高橋麻奈", "def@xyz.com");

        System.out.println(progC);
        System.out.println(progJava);
    }
}

/* 実行結果 ********************************************************
[明快 C 言語/2200 円/柴田望洋/abc@xyz.com]
[やさしい Java/2600 円/高橋麻奈/def@xyz.com]
*******************************************************************/
