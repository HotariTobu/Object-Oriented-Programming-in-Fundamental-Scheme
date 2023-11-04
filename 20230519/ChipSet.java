public class ChipSet {
    private int c10;
    private int c1;

    public ChipSet(int c10, int c1) {
        this.c10 = c10;
        this.c1 = c1;
    }

    public void change(int c10, int c1) {
        this.c10 += c10;
        this.c1 += c1;
    }

    public void change(int p) {
        this.c10 += p / 10;
        this.c1 += p % 10;
    }

    public String toString() {
        return "総額：" + (c10 * 10 + c1);
    }
}
