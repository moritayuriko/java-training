public class Hero  extends Character{
    String name;
    int hp;

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }
}//コピーしたファイル
