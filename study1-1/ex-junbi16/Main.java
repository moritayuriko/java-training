public class Main {

    public static void main(String[] args) {
        //３以上１０１以下の数字で素数(prm)をループで探したい
        for (int i = 3; i < 101; i++) {
        //素数だったらtrue!で変数宣言？初期化！
            boolean prn = true;
            for (int j = 2; j < i; j++) {
                
        
                if (i % j == 0) {
                    prn = false;
                
                }
            }
            if (prn) {
                System.out.println(i + ":素数である");
            } else {
                System.out.println(i + ":");
            }
        }
    }
}