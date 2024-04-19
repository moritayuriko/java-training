public class Main {

    // ()) {
    public static boolean loginCheck(String input1 ,String input2) {
       

        return input1.equals("helloUser") && input2.equals("helloPass");

    }

public static void main(String[] args) {
    boolean dekinai = true;

    while (dekinai) {
        System.out.println("ログインします");

        System.out.println("ユーザー名>");
        String input1 = new java.util.Scanner(System.in).nextLine();

        System.out.println("パスワード>");
        String input2 = new java.util.Scanner(System.in).nextLine();
       

        if (loginCheck(input1 ,input2)) {

            dekinai = false;
            System.out.println("ログイン成功");
        } else {
            System.out.println("ログイン失敗");
        }
    }
}
}