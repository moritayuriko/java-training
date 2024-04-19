public class Main {
    public static void main(String[] args) {
        // 1.勇者を生成
        // インスタンスの生成は… クラス名 変数名 ＝newクラス（);
        Hero h = new Hero();
        // 2.フィールドに初期値をセット
        // 名前とHPの部分ってこと！！！(変数名.フィールド名＝名前とかの値)
        h.name = "ミナト";
        h.hp = 100;
        // インスタンスに変数を設定しないとダメなのはこの下の行みたいにどの勇者か指定をしてあげるため！
        System.out.prinrln("勇者" + h.name + "を生み出しました！");

    }
}