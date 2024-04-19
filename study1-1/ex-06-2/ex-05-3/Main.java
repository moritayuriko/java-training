public static void email(String title, String addres, String text) {
    System.out.println(addres + "に" + "以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
}

public static void email(String address, String text) {
    System.out.println(address + "に" + "以下のメールを送信しました。");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
}

public static void main(String[] args) {
    String title = "メールのタイトル";
    String address = "メールの宛先アドレス";
    String text = "メールの本文";
    System.out.println("引数3つのとき");
    email(title, address, text);
    System.out.println("引数2つのとき");
    email(address, text);
}
