package jp.co.aforce.text2;

public class Stock {
	private Object lock = new Object();
	private int count = 0; //在庫数

	//コンストラクタ
	public Stock(int stock) {
		this.count = stock;
	}

	//	//倉庫から中身を取り出す
	//	public synchronized boolean take(int num) {
	//		//取ってきたい個数が在庫数より少ない場合
	//		if (num <= this.count) {
	//			try {
	//				Thread.sleep(10);
	//			} catch (InterruptedException e) {
	//				e.printStackTrace();
	//			}
	//			this.count -= num; //this.count = this.count - num;
	//			return true;
	//		} else { //取ってきたい個数が在庫数より多い場合はfalseで終了
	//			return false;
	//		}
	//	}

	//倉庫から中身を取り出す
	public boolean take(int num) {
		synchronized ((lock)) {
			//取ってきたい個数が在庫数より少ない場合
			if (num <= this.count) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.count -= num; //this.count = this.count - num;
				return true;
			} else { //取ってきたい個数が在庫数より多い場合はfalseで終了
				return false;
			}
		}
	}

	//countのゲッター
	public int getCount() {
		return this.count;
	}

}
