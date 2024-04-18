public class Main {
    static String[] stations = { "東京", "神田", "秋葉原", "御徒町", "上野",
            "鶯谷", "日暮里", "西日暮里", "田端", "駒込", "巣鴨", "大塚", "池袋",
            "目白", "高田馬場", "新宿", "代々木", "原宿", "渋谷", "恵比寿", "目黒",
            "五反田", "大崎", "品川", "高輪ゲートウェイ", "田町", "浜松町", "新橋", "有楽町" };
    // いつも書いてる始まりの文？
    public static void main(String[] args) {
        // 現在地にあたる数字を受け取る
        int input1 = new java.util.Scanner(System.in).nextInt();
        // input1で受け取った数字＝現在地をstation[input1]で駅名にしている
        System.out.println("現在" + stations[input1] + "駅、");
        // input1に１を足すことで次の駅にしている、さらに＝nexreStationに代入して纏めている
        String nextStation = stations[input1 + 1];
        // 表示している
        System.out.println("次は、" + nextStation + "駅です");
    }// メソッドを宣言し、moveInnerY（メソッド）で（）の中は引数リスト
//一だけ進むメソッド
    static String moveInnerY(int current) {
        // ヤマノテの現在地,と経過した駅に１を入れて戻している？
        return moveInnerY(current, 1);
    }
    // メソッドに同じ名前（moveInnerY(int current）を使いたいからオーバーロードするために
    // (int current, int through)と二個にして数を変えることで使えるようにしてる
    //～だけ進むという内容のメソッド
    static String moveInnerY(int current, int through) {
        // indexは索引？？（ゴール）索引に現在と経過駅数を足した式を入れてる
        int index = current + through;
        // stationsの配列の長さを調べている？ゴール超えた場合には超えないように引く
        if (index > stations.length) {
            // 配列の長さから１を引くことによって、配列からオーバーしないようにしている？
            index -= stations.length;
        } //
        ret;
    }urn stations(index)
}