package class26.exam01;

public class CarMain {
	public static void main(String[] args) {
		// 첫번째 자동차 객체 생성
		Car myCar1 = new Car();

		// 멤버 변수(필드)에 직접 접근해서 값저장
		myCar1.maker = "현대차";
		myCar1.model = "그랜저";
		myCar1.cc = 2000;
		myCar1.color = "white";
		myCar1.price = 3500;
		myCar1.maxspeed = 250;
		myCar1.speed = -120;

		// 첫번재 자동차 객체의 값 출력
		System.out.println(myCar1.maker);
		System.out.println(myCar1.model);
		System.out.println(myCar1.cc);
		System.out.println(myCar1.color);
		System.out.println(myCar1.price);
		System.out.println(myCar1.maxspeed);
		System.out.println(myCar1.speed);
		System.out.println();

		Car myCar2 = new Car();

		myCar2.maker = "기아차";
		myCar2.model = "K9";
		myCar2.cc = 3000;
		myCar2.color = "black";
		myCar2.price = 6000;
		myCar2.maxspeed = 300;
		myCar2.speed = 150;

		System.out.println(myCar2.maker);
		System.out.println(myCar2.model);
		System.out.println(myCar2.cc);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.maxspeed);
		System.out.println(myCar2.speed);
		System.out.println();

		// 자동차 객체의 값출력하는 또다른 방법(showCarINfo 메소드)
		// 첫번째 자동차 객체의 값 출력
		myCar1.showCarInfo();
		System.out.println();

		// 두번째 자동차 객체의 출력
		myCar2.showCarInfo();

	}

}
