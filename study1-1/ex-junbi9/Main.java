public class Main {
    public static void main(String[] args) {

        System.out.println("-100から100までの数字を入力してください。");
        int input = new java.util.Scanner(System.in).nextInt();

        for (int i = -100; i < 100; i++) {

        }
        if (input > -1) {
            System.out.print("正の");
        } else if (input < -1) {
            System.out.print("負の");

        }
        if (input % 2 == 0) {
            System.out.print("偶数" + input);
        } else if (input % 2 == 1) {
            System.out.print("奇数" + input);
        }
    }

}