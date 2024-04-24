public class Hero {
    String name;
    int hp;
    // ソードクラスをフォルダに入れちゃったから一旦消してる！後から気づいたらちゃんと戻すこと！
    // Sword sword;
    public void attack(){
        System.out.println(this.name+"は攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
    }
    //コンストラクタ!!!!!
    public Hero(String name){
        this.hp=100;
        this.name=name;
    }
    public Hero(){
        this.Hero("ダミー");
    }
    
}
