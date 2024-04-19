public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 3;
        int t = x;
        int tt = y;
        x = z;
        z = tt;
        y = t;

        /* ここでxとyとzの値を入れ替える */

        System.out.println("x=" + x + ",y=" + y + ",z=" + z);
    }

}