package jp.co.aforce.text;

public class Car {

	//クラス名はパスカル形式
	//1文字目が大文字
	//キャメル形式 myName
	//パスカル形式 MyName ←クラス名はこっち！

	//フィールド
	private int speed;

	int getSpeed() {

		return this.speed;
	}

	void speedUp(int value) {

		if (value < 0) {

			return;

		}

		this.speed += value; //フィールドの持つspeedにvalueを足している。

		if (this.speed >= 180) {

			this.speed = 180;

		}

	} //戻り値は返さない

	void speedDown(int value) {

		if (value < 0) {

			return;

		}

		this.speed -= value; //フィールドの持つspeedにvalueを引いている。

		if (this.speed <= -15) {

			this.speed = -15;
		}

	}

	//戻り値を返す
//	String getName(String name) {
//
//		String akamaName = "赤間" + name;
//
//		return akamaName;
//	}

}
