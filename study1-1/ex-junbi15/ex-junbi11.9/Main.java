public class Main {
    public static void main(String[] args) {
        System.out.print("数字 を入力 > ");
        String input = new java.util.Scanner(System.in).nextLine();
        int n = Integer.parseInt(input);

        boolean isAho = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '3') {
                isAho = true;
            } else if (n % 3 == 0) {

                isAho = true;
            }
        }

        /* inputが3の倍数の時にisAhoをtrueにする */

        if (isAho) {
            System.out.println("アホ");
        } else {
            System.out.println("...");
        }

    }
}
