public class Main {
    public static void main(String[] args) {
        String[] seq = new String[5];
        for (int i = 0; i < seq.length; i++) {
            System.out.println((i + 1) + "文字目を入力してください > ");
            seq[i] = new java.util.Scanner(System.in).nextLine();
        }

        // // 逆に表示したい。五から始まって減らしてく
        // j > 0 のループで、そして、ループの最後に j の値を1つ減らして逆に
        for (int j = 5; j > 0; j--) {
            System.out.println((5 - j + 1) + "文字目: " + seq[j - 1]);
        }
    }
}