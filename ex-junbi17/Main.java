public class Main {
    public static void main(String[] args) {
        // //［うるう年の条件］
        // 西暦年号が4で割り切れる年をうるう年とする。
        // 1の条件の例外として、
        // 西暦年号が100で割り切れて400で割り切れない年は平年とする。
       

        for (int i = 1004; i < 3000; i++) {
            if (!(i % 400 == 0)&& i % 100 == 0) {
                 
            } else if (i % 4 == 0) {
            System.out.println(i + "年");
        }
    }
}
}