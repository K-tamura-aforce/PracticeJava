package jp.co.aforce.text2;

public class InspectionExample {

	public void method1() {
		method2();
	}

	public void method2() {

		try {
			method3();
			System.out.println("ここは実行されません");
		} catch (Exception e) {
			System.out.println("例外が通知されました。");
			e.printStackTrace();
		}
	}

	public void method3() throws Exception {
		throw new Exception();
	}
}
