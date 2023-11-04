// 2023年06月16日

public interface Shipping {
    // 製品情報（品名、コード、価格）を返す
    String info();

    // 製品の送料を返す
    int shipping();

    // 製品の手数料を返す
    int handling();
}
