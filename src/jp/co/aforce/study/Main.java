package jp.co.aforce.study;

import java.util.ArrayList;

public class Main {

	private static final double TAX = 0.1;

	enum Season {
		SPRING,SUMMER,AUTUMN,WINTER
	};

	public static void main(String[] args) {


		int amount = (int)(1500*(1 + TAX));

		System.out.println(amount + "円");

		Dog dog = new Dog();

		//	dog.name = "ぽち";
		//
		//	dog.age = 3;
		//
		//	dog.showProfile();

		dog.setName("ゴロウ");

		dog.setAge(56);

		dog.showProfile();

		Cat cat = new Cat();

		cat.setName("イノリ");

		cat.setAge(16);

		cat.showProfile();

		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Animal());
		animals.add(new Dog());
		animals.add(new Cat());

		//拡張for文 (制御構文) コレクションの繰り返し時によく使われるモノ
		for(Animal animal:animals) {
			animal.speak();

		}

		//Mailクラスを実行
		Mail mail = new Mail();

		//件名あり
		System.out.println("----------------*-------------*--------------");
		mail.sendMail("打合せ","13時から打合せです","test@mail.com");

		//件名なし
		System.out.println("----------------*-------------*--------------");
		mail.sendMail("13時から打合せです","test@mail.com");

		for(Season season:Season.values()) {
			System.out.println(season.toString());
		}
	}

}
