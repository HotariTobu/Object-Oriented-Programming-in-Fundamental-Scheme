// 2023年07月21日

public class Book {
    // 書籍のタイトル
    private String title;
    // 書籍の価格（ドル、円などを含めて文字列とみなす）
    private String price;
    // 書籍の著者
    private Author author;

    public Book(String title, String price, String authorName, String authorMail) {
        this.title = title;
        this.price = price;
        this.author = new Author(authorName, authorMail);
    }

    @Override
    public String toString() {
        return "[" + title + "/" + price + "/" + author.getName() + "/" + author.getMail() + "]";
    }
}

/* 実行結果 ********************************************************

*******************************************************************/
