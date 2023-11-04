// 2023年05月26日

public class Tool {
    static final String[] NAMES = { "ノリ", "はさみ", "定規" };

    private int code;

    public Tool(int code) {
        this.code = code;
    }

    public String name() {
        return NAMES[code];
    }
}
