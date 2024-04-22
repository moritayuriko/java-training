配列とinputでinputを配列にして比較できるようにした問題


public class Main {
    public static void main(String[] args) {

        System.out.println("ロト4を始めます");
        int[] winningNumber = { 4, 4, 1, 2 };
        boolean rot = true;
        // // ランダムであたりを生成する
        // int[] winningNumber = {
        // new java.util.Random().nextInt(1, 10),
        // new java.util.Random().nextInt(1, 10),
        // new java.util.Random().nextInt(1, 10),
        // new java.util.Random().nextInt(1, 10) };
int []input=new int[4];
        for (int i = 0; i < winningNumber.length; i++) {
            // i+1個目の数字を入力してください >
            System.out.println((i + 1) + "個目の数字を入力してください >");
             input[i] = new java.util.Scanner(System.in).nextInt();
        }
            for (int i = 0; i < winningNumber.length; i++) {

                if (input[i]!=winningNumber[i]) {
                   rot=false;
                }
            }
                if (rot) {
                    System.out.println("＼大当たり／");
                } else {
                    System.out.println("はずれ...");
                }
            }
        }