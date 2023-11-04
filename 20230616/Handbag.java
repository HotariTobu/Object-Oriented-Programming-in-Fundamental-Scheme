// 2023年06月16日

public class Handbag extends AbsProduct implements Shipping {
    // サイズ
    private int size;

    public Handbag(int code, String name, int size) {
        super(code, name);

        this.size = size;
    }

    @Override
    public String info() {
        return name + "\t" + code + "\t" + price();
    }

    @Override
    public int shipping() {
        switch (size) {
            case 1:
                return 500;

            case 2:
                return 700;
        }

        return 100;
    }

    @Override
    public int handling() {
        if (size >= 2) {
            return 200;
        }

        return 0;
    }

    @Override
    public int price() {
        int type = code % 100;

        switch (type) {
            case 11:
                return 10000;

            case 22:
                return 12000;
        }

        return 15000;
    }
}
