public class Main {
    public static void main(String[] arg) {
        for (int r = 1; r < 101; r++) {
            System.out.print(r + ":");
            if (r %3 == 0) {
                System.out.print("Fizz");
            }
            if (r %5== 0) {
                System.out.print("Buzz");
            }
            System.out.println("");
        } 
    }
}