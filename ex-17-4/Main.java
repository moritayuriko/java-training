import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("数字を入力してください>");
        int number = new java.util.Scanner(System.in).nextInt();
        try {
            if (number < 1) {
                throw new IOException("数字は1以上にしてください");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
