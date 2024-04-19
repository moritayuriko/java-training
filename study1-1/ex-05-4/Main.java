public class Main {
    // 一つ目
    public static double calcTriangleArea(double bottom, double height) {
        double ans = (bottom * height) / 2;
        return ans;
    }

    // 二つ目
    public static double calcCicleArea(double radius) {
        double pi = Math.PI;
        double ans = pi * radius * radius;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calcTriangleArea(10, 5));
        System.out.println(calcCicleArea(5));
    }
}