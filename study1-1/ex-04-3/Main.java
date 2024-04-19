nullを使った結果のエラー
NullPointerException

添字[2]→[1]
ArrayIndexOutOfBoundsException

Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>" is null
        at Main.main(Main.java:5)

public class Main {
    public static void main(String[] args) {
        int[] counts = new int[2];
        float[] heights = { 17.113F, 17.05F };
        System.out.println(counts[1]);
        System.out.println(heights[1]);
    }
}