// 2023年06月16日

public class Product {
    // 製品コード番号
    protected int code;
    // 製品名
    protected String name;

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
