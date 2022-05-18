package jp.co.aforce.study;

public class Mail {

	//件名ありのメール送信メソッド
	void sendMail(String title, String text, String address) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	//件名なしのメール送信メソッド
	void sendMail(String text, String address) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
		
		
	}

}
