public class Hero extends Character {
    public void attack(Monster m){
        System.out.println(this.name+"の攻撃！");
        m.hp-=10;
    }
}
