package jp.co.aforce.practice;

import java.util.Calendar;
import java.util.HashSet;

public class PracticeTest5 {

	public static void main(String args[]) {

		HashSet<String> animal = new HashSet<>();

		animal.add("犬");

		animal.add("猫");

		animal.add("うさぎ");

		animal.add("へび");

        String x = "猫";

		if (animal.contains(x)) {

			System.out.println(x + "はリストに含まれています");

		} else {

			System.out.println(x + "はリストに含まれていません");
		}

		int M = 6;

		Calendar calendar = Calendar.getInstance();

		String month;

//		switch(calendar.get(Calendar.MONTH)){

		switch(M) {

			case 0:
				month = "元旦, 成人の日";
				break;

			case 1:
				month = "建国記念の日, 天皇誕生日";
                break;

			case 2:
				month = "春分の日";
				break;

			case 3:
			    month = "昭和の日";
			    break;

			case 4:
				month = "憲法記念日, みどりの日, こどもの日";
				break;

			case 5:
				month = "なし";
				break;

			case 6:
				month = "海の日, スポーツの日";
				break;

			case 7:
				month = "山の日";
				break;

			case 8:
				month = "敬老の日, 秋分の日";
				break;

			case 9:
				month = "なし";
				break;

			case 10:
				month = "文化の日, 勤労感謝の日";
				break;

			default:
				month = "なし";
				break;

		}

		System.out.println(month);

	}

}
