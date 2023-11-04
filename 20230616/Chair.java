// 2023年06月16日

public class Chair extends AbsProduct implements Shipping {
    public Chair(int code, String name) {
        super(code, name);
    }

    @Override
    public String info() {
        return name + "\t" + code + "\t" + price();
    }

    @Override
    public int shipping() {
        int type = code % 10;

        switch (type) {
            case 1:
                return 1200;

            case 9:
                return 900;
        }

        return 600;
    }

    @Override
    public int handling() {
        return 200;
    }

    @Override
    public int price() {
        int type = code % 10;

        switch (type) {
            case 1:
                return 12000;

            case 9:
                return 9000;
        }

        return 6000;
    }
}
