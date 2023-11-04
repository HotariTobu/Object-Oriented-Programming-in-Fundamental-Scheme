// 2023年05月19日

import java.security.InvalidParameterException;
import java.util.Random;

public class Player {
    private String name;
    private int level;
    private int hp;

    public Player(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public Player(String name) {
        this(name, 1, 10);
    }

    public void damage(int p, double r) throws InvalidParameterException {
        if (r < 0 || 1 < r) {
            throw new InvalidParameterException("Param `r` should be in [0, 1]");
        }

        if (new Random().nextDouble() < r) {
            hp -= p;

            if (hp < 0) {
                hp = 0;
            }
        } else {
            System.out.println("ダメージを受けない");
        }
    }

    public void damage(int p) throws InvalidParameterException {
        damage(p, 0.8);
    }

    @Override
    public String toString() {
        return name + ":level=" + level + " HP=" + hp;
    }
}
