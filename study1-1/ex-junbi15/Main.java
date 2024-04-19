public class Main {
    public static void main(String[] args) {
        int l = 0;
        int w = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("勝敗を入力してください(0:負け, 1:勝ち) >");
            int input = new java.util.Scanner(System.in).nextInt();
            if (input == 0) {
                l++;
            } else if (input == 1) {
                w++;
            }
        }
        System.out.println("勝ち: " + w + "回, 負け: " + l + "回");
    }
}
