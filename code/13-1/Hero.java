public class Hero {
    int hp;
    String name;
    Sword sword;
    public void bye(){
        System.out.println("勇者は別れを告げた");
    }
    public void die(){
        System.out.println(this.name+"はうっかり死んでしまった！");
        System.out.println("GAME OVER");
    }
    public void sleep(){
        this.hp=100;
        System.out.println(this.name+"は眠って回復した");
    }
    public void attack(Matango m) {
        System.out.println();
        System.out.println("お化けキノコから2ポイントの反撃を受けた!");
        this.hp-=2;
        if(this.hp<0){
            this.die();
        }
    }

    
}
