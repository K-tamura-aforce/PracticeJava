package jp.co.aforce.text;

public class Car {

	//クラス名はパスカル形式
	//1文字目が大文字
	//キャメル形式 myName
	//パスカル形式 MyName ←クラス名はこっち！

	//フィールド
//	private int speed;
//	protected int speed;
//	private Engine engine;
//	private String name = "本体";
//
//	class Engine {
//		void start() {
//			System.out.println("エンジンスタート");
//		}
//		private String name = "エンジン";
//
//		void check() {
//			System.out.println(this.name); //this→Engine エンジン
//			System.out.println(Car.this.name); //this→Car 本体
//		}
//	}
//
//	//コンストラクター
//	Car() {
//		this.engine = new Engine();
//
//	}
//
//	void start() {
//		this.engine.start();
//		System.out.println("発車できます");
//	}

//	Car () {
//		this.speed = 0;
//
//	}

//	Car(int speed) {
//
//		this.speed = speed;
//	}

//	int getSpeed() {
//
//		return this.speed;
//	}

//	void speedUp(int value) {
//
//		if (value < 0) {
//
//			return;
//
//		}

//		this.speed += value; //フィールドの持つspeedにvalueを足している。
//
//		if (this.speed >= 180) {
//
//			this.speed = 180;
//
//		}
//
//	} //戻り値は返さない
//
//	void speedDown(int value) {
//
//		if (value < 0) {
//
//			return;
//
//		}
//
//		this.speed -= value; //フィールドの持つspeedにvalueを引いている。
//
//		if (this.speed <= -15) {
//
//			this.speed = -15;
//		}
//
//	}

	//戻り値を返す
	//	String getName(String name) {
	//
	//		String akamaName = "赤間" + name;
	//
	//		return akamaName;
	//	}

	String getCarType() {

		return "自動車";

		//オーバーライド
		//継承関係を持つクラスにおいて親が持つメソッドを子が書き換えること。

	}

	private String owner;

	void setOwner(String owner) {

		this.owner = owner;

	}

	void lock(Key key) {
		System.out.println("鍵でロックしました");

	}

	void lock(RemoteController controller) {
		System.out.println("リモコンでロックしました");
	}

	//finalをつけてオーバライドを禁止する
	final void initialize () {
		this.speed = 0;
	}

	private static final int MAX_SPEED = 180;
	private int speed;

	void speedUp(int value) {
		this.speed += value;

		if(this.speed >= MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}


}
