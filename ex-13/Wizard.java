public class Wizard {
    private int hp;
    private int mp;
    private String name;
    public Wand wand;

    public String getName(String name) {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getNp() {
        return this.mp;
    }
    public Wand getWand() {
        return this.wand;
    }

    public void setName(String name) {
        // 記述
        if (name.length() <= 3) {
            throw new IllegalArgumentException
            ("名前が三文字以下。処理を中断");
        }
        this.name = name;
    }

    public void setHp(int hp) {
        // 記述
        if (hp <= 0) {
            throw new IllegalArgumentException
            ("HPが0以下。処理を中断。");
        }
            this.hp = hp;
        }

    public void getNp(int np) {
        // 記述
        if (np <= 0) {
            throw new IllegalArgumentException
            ("NPが0以下。処理を中断。");
        }
        this.mp = mp;
    }
    public void setWand(Wand wand) {
        // 記述
        if (wand==null) {
            throw new IllegalArgumentException
            ("杖を装備していない。処理を中断。");
        }
        this.wand = wand;
    }

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.power);
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}