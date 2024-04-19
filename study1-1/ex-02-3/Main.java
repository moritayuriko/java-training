public class Main {
    public static void main (String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください。");
        String name =new java.util.Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください。");
        int agestring =new java.util.Scanner(System.in).nextInt();
        int fortune =new java.util.Random().nextInt(3);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(agestring + "歳の" + name + "さん、あなたの運気番号は" + fortune);
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");
 } 
}      