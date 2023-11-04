// 2023年06月23日

public class TriangleException extends Exception {
    private String mes;

    public TriangleException(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "例外処理：" + mes;
    }
}
