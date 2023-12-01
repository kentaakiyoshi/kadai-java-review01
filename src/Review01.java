public class Review01 {

    // 消費税を計算するメソッド
    public static int tax(int price) {
        return (int) (price * 0.10); // 10%の消費税を計算
    }

    public static void main(String[] args) {
        int productPrice = 1500; // 商品価格
        int taxAmount = tax(productPrice); // 消費税の計算
        int taxIncludedPrice = productPrice + taxAmount; // 税込価格の計算

        // 結果の出力
        System.out.println(productPrice + "円の商品の税込価格は：" + taxIncludedPrice + "円（消費税は" + taxAmount + "円です）。");
    }
}