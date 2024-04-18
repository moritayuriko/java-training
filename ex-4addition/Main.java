public class Main {
    public static void main(String[] arg) {
        int[] numbers = new int[5];
        int A = numbers[0];
        int B = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new java.util.Random().nextInt(10);

            System.out.print(numbers[i] + ",");

        }
        System.out.println("");

        A = numbers[0];
        B = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (A < numbers[i]) {
                A = numbers[i];
            } else if (B > numbers[i]) {
                B = numbers[i];
            }
        }

        System.out.println("最大値：" + A);
        System.out.println("最小値：" + B);
        
        int D = numbers[numbers.length-1];
        numbers[numbers.length-1] = numbers[0];
        numbers[0] = D;
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + ",");
           
        }
    }
}