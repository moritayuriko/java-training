public class Main {

    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
        }
        System.out.println("--スタックトレース（ここから）");
        Exception e = new Exception();
        e.printStackTrace();
        System.out.println("--スタックトレース（ここまで）");

    }
}

// int[]s=new int[5];
// int num =s.length;
// System.out.println("要素の数は"+num);