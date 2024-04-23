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
      
        heal(baseHp);
       //↑が動いてない
        System.out.println(baseHp+":"+t.hp);
        //25:25
        heal(t);
        System.out.println(baseHp+":"+t.hp);
        //25:35

        // ＜表示される理由＞
        //baseHPが25になったのはbaseHPはint型で25という数字のコピーの移動方法、値渡しが行われたから。
        //値渡しの方法だったため、baseHP本体に影響はなく、またheal()の戻り値はvoidであるため、戻ることもできず25のままだった。
        //一方変数tは参照渡しでbaseHPを渡しているため、本体に加算することができたため数値に変動が起きた！
        //値渡しは数字のコピーを渡されているからコピーの紙にいくら数字を足しても、原本に影響はなく、
        //参照渡しは実際の土地の住所が書かれた紙のコピーをもらってそこ行って上に家建ててね！（土地自体に変更を加えている。）というような解釈であってますか？
    }
}

