public class Main {
    public static void heal(int hp) {
        //ヒールはhpを10回復します
        hp+=10;
        
    }
    public static void heal(Thief thief){
        //HPを10回復する
        thief.hp+=10;
    }
    public static void main(String[] args) {
        //ベースHPは25です。
        int baseHp = 25;
        Thief t= new Thief("アサカ",baseHp);
        //呼び出されたのは2個目の方
        //ここでどっちも25を得ている？
        heal(baseHp);
       //↑が動いてない！っぽい?
        System.out.println(baseHp+":"+t.hp);
        //25:25
        heal(t);
        System.out.println(baseHp+":"+t.hp);
        //25:35
       
    }
}

