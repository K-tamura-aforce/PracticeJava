package jp.co.aforce.practice;

public class PracticeTest6 {

	public static void main(String args[]) {

		int fortune = new java.util.Random().nextInt();

		//		if(fortune == 1) {
		//
		//			System.out.println("吉です");
		//
		//		} else if (fortune == 2) {
		//
		//			System.out.println("中吉です");
		//
		//		} else if (fortune == 3) {
		//
		//			System.out.println("大吉です");
		//
		//		} else {
		//
		//			System.out.println("凶です");
		//		}
		//	}

		switch (fortune) {

		case 1:
			System.out.println("吉です");
			break;

		case 2:
			System.out.println("中吉です");
			break;

		case 3:
			System.out.println("大吉です");
			break;

		default:
			System.out.println("凶です");
			break;

		}

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 7 == 0) {

				System.out.println(i);
				sum += i;

			}
		}

		System.out.println("7の倍数の総合値は" + sum);

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.print(" " + i * j);

			}

			System.out.println();

		}

	}

}
