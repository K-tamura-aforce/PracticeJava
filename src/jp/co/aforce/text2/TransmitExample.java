package jp.co.aforce.text2;

public class TransmitExample {

	public void method1() {
		method2();
	}

	public void method2() {
		try {
			method3();
			System.out.println("ここは実行されません。");
		} catch (RuntimeException e) {
			System.out.println("例外が通知されました。");
		}
	}

	public void method3() {
		throw new RuntimeException();
	}

	//F5:ステップイン その行の中の処理に行く
	//F6:ステップオーバー その1行を実行
	//F8:処理が再開（次のブレイクポイント、もしくは最後まで処理を実行する）

}
