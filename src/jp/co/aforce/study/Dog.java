package jp.co.aforce.study;

public class Dog extends Animal{

//	private String name;
//
//	private int age;
//
//	void setName(String name) {
//
//		this.name = name;
//
//	}
//
//	void setAge(int age) {
//
//		this.age = age;
//
//	}
//
//	void showProfile() { //コンソールに出力するメソッドのためvoid
//
//		System.out.println("名前は" + this.name + "、年齢は" + this.age +"歳です");
//
//	} //設計書段階のため実行できない

    @Override
	void speak () {

		System.out.println("わんわん");

	}

}
