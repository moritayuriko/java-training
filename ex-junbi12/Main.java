public class Main {
    public static void main(String[] args) {
        System.out.println("曜日を入力してください");
        System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 >");
        int day = new java.util.Scanner(System.in).nextInt();
        System.out.println("時間を入力してください");
        System.out.print("0=午前、1=午後、2=夜間 >");
        int ti = new java.util.Scanner(System.in).nextInt();

        boolean isOpen = true;

        // 最終的に「開いているか、閉まっているか」を分ける必要がある

        // trueとfalseはどうだろう！！！113Pを参照

        if (day == 0) {
            isOpen = false;

        } else if (day == 1 && ti == 2) {
            isOpen = false;
        } else if (day == 1 && ti == 0) {
            isOpen = true;
        } else if (day == 1 && ti == 1) {
            isOpen = true;
            // 火
        } else if (day == 2 && ti == 2) {
            isOpen = false;
        } else if (day == 2 && ti == 0) {
            isOpen = true;
        } else if (day == 2 && ti == 1) {
            isOpen = true;
            // 水
        } else if (day == 3 && ti == 1) {
            isOpen = false;
        } else if (day == 3 && ti == 2) {
            isOpen = false;
        } else if (day == 3 && ti == 0) {
            isOpen = true;
            // 木曜
        } else if (day == 4 && ti == 1) {
            isOpen = false;
        } else if (day == 4 && ti == 2) {
            isOpen = false;
        } else if (day == 4 && ti == 0) {
            isOpen = true;
            // 金
        } else if (day == 5 && ti == 0) {
            isOpen = true;
        } else if (day == 5 && ti == 1) {
            isOpen = true;
        } else if (day == 5 && ti == 2) {
            isOpen = false;
            // 土曜
        } else if (day == 6 && ti == 0) {
            isOpen = false;
        } else if (day == 6 && ti == 1) {
            isOpen = false;
        } else if (day == 6 && ti == 2) {
            isOpen = true;
        }

        if (isOpen) {
            int R = new java.util.Random().nextInt(4) + 1;
            switch (R) {
                case 1 -> {
                    System.out.println("病院は開いています");
                    System.out.println("診療結果は インフルエンザでした");
                }
                case 2 -> {
                    System.out.println("病院は開いています");
                    System.out.println("診療結果は 新型コロナウィルスでした");
                }
                case 3 -> {
                    System.out.println("病院は開いています");
                    System.out.println("診療結果は 風邪でした");
                }
                case 4 -> {
                    System.out.println("病院は開いています");
                    System.out.println("診療結果は 仮病でした");

                }
            }
        } else {
            System.out.println("病院は休診です。");
        }

    }
}