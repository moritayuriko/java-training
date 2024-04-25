public class Hero  extends Character{
    String name;
    int hp;

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージ");
        m.hp -= 10;
    }
    public void attack(Goblin g){
        System.out.println(this.name+"の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた!");
        g.hp-=10;
    }
}//以下スライム用など続く
