public class Main {
    public static void main(String[] args) {
        System.out.println("BMIを計算します");
        System.out.println("身長と体重を入力してください");
        System.out.print("身長(cm)＞");
        double height = new java.util.Scanner(System.in).nextInt();
        double m = height / 100;
        System.out.print("体重(kg)＞");
        double weight = new java.util.Scanner(System.in).nextInt();

        double BMI = weight / (m * m);
        System.out.println("あなたのBMIは" + BMI + "でした");
    }
}