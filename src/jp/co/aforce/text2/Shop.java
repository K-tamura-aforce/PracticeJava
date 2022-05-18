package jp.co.aforce.text2;

public class Shop extends Thread{
	private Stock stock = null;
	private String name = null;

	//コンストラクタ
	public Shop(Stock stock, String name) {
		this.stock = stock;
		this.name = name;
	}

	public void run() {
		while (true) {
			//在庫から1つ取り出せなくなったら(在庫がなくなったら)
			if (!this.stock.take(1)) {
				break;
			}
			System.out.printf("%s:商品を1個取り出しました。%n", this.name);

			//System.out.printf→書式を指定して出力
			//System.out.printf(書式,引数1,引数2,…)
			//s:文字列
			//n:改行
			//d:整数
		}
		System.out.printf("%s:残りの在庫は%d個です。%n", this.name, this.stock.getCount());
		//System.out.println(this.name + "残りの在庫は" + this.stock.getCount() + "個です。") ;
	}

}
