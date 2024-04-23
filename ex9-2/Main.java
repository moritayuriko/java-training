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

        // ＜表示される理由＞
        // heal(baseHp)が正常に動作しなかった原因を考察する。
        // baseHPはheakl外部で宣言されたわけではないため、メソッド内で加算がなされても、
        // 大元となるbaseHPに影響を与えなかったのではなかろうか。
        // また、推察ではあるがbaseHp=25は計算されたわけではなく、アドレスをコピーした形であり、
        // コピーした値の25を取得している。表示する際にはそのアドレスを参照しており、
        // あたかも計算が行われたかのように見えるのではないかと考察した。
       
    }
}

