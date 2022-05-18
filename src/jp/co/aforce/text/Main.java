package jp.co.aforce.text;

import jp.co.aforce.sample.Sample;
import jp.co.aforce.study.Mail;

public class Main {

	public static void main(String[] args) {

//		Car car;
//
//		car = new Car();

//		Car car = new Car();

//		car.speed = 80;
//
//		System.out.println("スピード:" + car.speed);
//
//		car.speedUp(10); //メソッドに飛ぶF3キー メソッドから戻るAlt+左矢印キー
//		System.out.println("スピード:" + car.speed);
//
//		int newSpeed = 80;
//
//		car.speedUp(newSpeed);
//
//		System.out.println("スピード:" + car.speed);

//		car.speedUp(40);
//		car.speedDown(10);
//
//		System.out.println("速度 = " + car.getSpeed());
//
//		Truck truck = new Truck();
//		truck.addPayload(10);
//		truck.speedUp(60);

		//Car car = new Truck();

//		System.out.println(car.getCarType());
//
//		Car car1 = new Car();
//		System.out.println(car1.getCarType());
//
//		Car car2 = new Truck();
//		System.out.println(car2.getCarType());
//
//		Car car3 = new LongDriveTruck();
//		System.out.println(car3.getCarType());

//		ArrayList<Car> cars = new ArrayList<>();
//
//		cars.add(new Car());
//		cars.add(new Truck());
//		cars.add(new LongDriveTruck());

        //拡張for文 (制御構文) コレクションの繰り返し時によく使われるモノ
//		for(Car car : cars) {
//			System.out.println(car.getCarType());
//
//		}
//
//		Car car = new Car(); //1つ目のコンストラクターでインスタンス化
//
//		Car myCar = new Car (60); //2つ目のコンストラクターでインスタンス化
//
//		//myCar.Car();コンストラクターはメソッドのような呼び出しは不可

		Car car1 = new Car();
		Key key = new Key();
		car1.lock(key);

		Car car2 = new Car();
		RemoteController controller = new RemoteController();
		car2.lock(controller);

//		Car car = new Truck(); //①サブクラスのインスタンスをスーパークラスに代入
//		Truck truck1 = car; //②
//		Truck truck2 = (Truck) car; //③
		
		//Ctrl + Shift + O →インポート文のショートカット
		Mail mail = new Mail();
	    Sample sample = new Sample();

	}

}
