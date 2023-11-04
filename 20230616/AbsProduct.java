// 2023年06月16日

public abstract class AbsProduct extends Product {
    public AbsProduct(int code, String name) {
        super(code, name);
    }

    // 価格を返す
    public abstract int price();
}
