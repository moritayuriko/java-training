public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m = new Matango('A'); 
        // ↑でnew Matangoにエラーが出たのは、引数('A')が必要なmatangoのクラスから持ってきてたからだった！！
        h.attack(m);
    }
}
