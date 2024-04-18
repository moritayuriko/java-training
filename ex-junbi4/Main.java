public class Main {
    public static void main(String[] args) {
        double x = 3.14159265;
        double y = 0.002;
        double t = x;
        x = y;
        y = t;
        System.out.println("x=" + x + ",y=" + y);

    }
}