public class Main {
    public static void main(String[] args) {

        System.out.print("自己採点結果 を入力>");
        int input = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i < 100; i++) {

        }
        if (input > 60) {
            System.out.println("合格");
        } else if (input < 60) {
            System.out.println("不合格");

        }

        if (input > 80) {
            System.out.println("たいへんよくできました");
        } else if (60 < input && input < 80) {
            System.out.println("よくできました");
        } else if (60 > input) {
            System.out.println("ざんねんでした");
        }

        if (input > 80) {
            System.out.println("優");
        } else if (60 < input && input < 80) {
            System.out.println("良");
        } else if (60 < input && input < 70) {
            System.out.println("可");
        } else if (60 > input) {
            System.out.println("不可");

        }
    }
}