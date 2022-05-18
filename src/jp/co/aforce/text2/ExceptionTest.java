package jp.co.aforce.text2;

public class ExceptionTest {

	public static void main(String args[]) {

		int[] numbers = { 0, 1, 2 };

		try {

			//配列の内容を表示
			for (int i = 0; i < 4; i++) {

				System.out.println("numbers[" + i + "]=" + numbers[i]);

			}

		} catch (ArrayIndexOutOfBoundsException e) {//範囲外の要素が指定されたときに起きる例外

			System.out.println("配列の範囲を超えています。");
		}
	}

}
