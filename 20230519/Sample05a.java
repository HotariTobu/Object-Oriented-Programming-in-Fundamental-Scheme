public class Sample05a {
    public static void main(String[] args) {
        ChipSet cs = new ChipSet(0, 0);

        cs.change(1, 1);
        System.out.println(cs);
        
        cs.change(15);
        System.out.println(cs);
    }
}
