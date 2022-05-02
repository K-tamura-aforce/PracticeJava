package jp.co.aforce.study;

public class Main {

	public static void main(String[] args) {

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

	}

}
