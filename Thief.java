public class Thief extends Character{
    
    String name;
    int hp;
    int mp;
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }


}
