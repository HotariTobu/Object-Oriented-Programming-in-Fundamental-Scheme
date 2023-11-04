// 2023年05月26日

public class Item extends Tool {
    // 道具の値段
    private int price;

    public Item(int code, int price) {
        super(code);

        this.price = price;
    }

    // 「[道具の名前]：[道具の値段]円」の文字列を返す
    public String toString() {
        return name() + "：" + price + "円";
    }
}
