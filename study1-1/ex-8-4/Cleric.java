
public class Cleric {
    String name;
    int hp = 50;
    final int MaxHP = 50;
    int mp = 10;
    final int MaxMP = 10;

    public void selfAid() {
        this.hp = MaxHP;
        this.mp -= 5;
        System.out.println(this.name + "は、セルフエイドを使った！");
        System.out.println(this.name + "のMPは" + 5 + "減った!");
        System.out.println(this.name + "のHPは最大になった!");
    }

    public int pray(int byou) {
        System.out.println(this.name + "は祈り始めた!");
        if (byou == 0) {
            System.out.println("祈りが中断され、何も起こらなかった…");
            return 0;
        }
        int lucky = new java.util.Random().nextInt(3) + byou;
        int mpkaihukuryou = this.mp + lucky;
        if (mpkaihukuryou > MaxMP) {
            //仮に今の値（今のMP）がわからなくても、将来的には他の呼び出し先とかでthis mpの値は何かしら入るから、
            //！今値が入っていなくても！式としては成立するよ。
            lucky=MaxMP-this.mp;
            this.mp = MaxMP;

        } else {
            this.mp += lucky;
        }

        if (byou != 0) {
            System.out.println(this.name + "は" + byou + "秒間祈って" + "MPを" + this.mp + "に回復した！");
        }
        //このリターンラッキーは実際に回復した量を示しているよ。
        //元のmp６+祈って得た値４＝１０でいうと４が欲しいっていうリターン
        return lucky;
    }

    public static void main(String[] args) {
        // 確認でヒーラーさんを生成
        Cleric healer = new Cleric();
        healer.name = "ハピナス";

        healer.selfAid();
        healer.pray(3);

    }
}
