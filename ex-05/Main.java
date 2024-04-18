public class Main {
    public static void introduceOneself(String name, int age, double height, String zodiac) {
        System.out.println("私の名前は" + name + "です。");
        System.out.println("歳は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("十二支は" + zodiac + "です。");
    }

    public static void main(String[] args) {
        introduceOneself("湊雄輔", 22, 169.9, "辰");
    }
}