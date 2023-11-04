// 2023年04月21日

public class Range {
    private double min;
    private double max;

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    // vがmin以上max未満のときはtrue、それ以外のときはfalseを返す
    public boolean isOK(double v) {
        return min <= v && v < max;
    }

    // 範囲の文字列表現"min:○○ -- max:○○"を返す
    public String outputRange() {
        return "min:" + min + " -- max:" + max;
    }
}
