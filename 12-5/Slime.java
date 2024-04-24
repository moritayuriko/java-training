public class Slime extends Monster {
    public void run(){
        System.out.println("スライムはサササっとは逃げ出した。");
    }
    }
    
    // 仮にmainメソッドで両方出力してあげたかったらここで親を呼ぶらしい！
    //public class Slime extends Monster {
    //     public Slime() {
    //         super.run(); // 親クラスのrun()メソッドを呼び出す
    //         System.out.println("スライムはサササっとは逃げ出した。")