package jp.co.aforce.text;

public class Person {

	private String name;              //通常のフィールド
	private static int count;    //静的フィールド

	void setName(String name) {
		this.name = name;
	}

	static void setCount(int count) {
		Person.count = count;
	}

}
