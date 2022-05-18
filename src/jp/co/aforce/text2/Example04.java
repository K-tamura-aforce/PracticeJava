package jp.co.aforce.text2;

public class Example04 {

	public static void main(String[] args) {
		Stock stock = new Stock(10);
		Shop shop1 = new Shop(stock, "shop1");// [shop1]という、在庫10ある倉庫を持つお店(のインスタンス)
		Shop shop2 = new Shop(stock, "shop2");

		shop1.start();
		shop2.start();

	}

}
