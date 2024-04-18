public class Main {
    public static int SumScore(int[] scores) {
        // scores=points
        int SumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            SumScore += scores[i];
        }
        return SumScore;
    }

    public static int AverageScore(int[] ave) {
        int avg = 0;
        int AverageScore = SumScore(ave) / ave.length;
        return AverageScore;
    }

    public static void main(String[] args) {
        int[] points = { 20, 30, 40, 50, 80 };
        int sum = SumScore(points);
        int avg = AverageScore(points);
        System.out.println("合格点:" + sum);
        System.out.println("平均点:" + avg);
    }
}