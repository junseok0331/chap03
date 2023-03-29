package class26.exam01;

public class Car {

	String maker;
	String model;
	int cc;
	String color;
	int price;
	int maxspeed;
	int speed;

	
	Car() {// 기본 생성자
	}

	// 오버로딩 생성자(파라미터)
	Car(String maker, String model, int cc, String color, int price, int maxspeed, int speed) {
		this.maker = maker;
		this.model = model;
		this.cc = cc;
		this.color = color;
		this.price = price;
		this.maxspeed = maxspeed;
		this.speed = speed;

	}

	// 생성된 객체의 정보를 보여주는 메소드[속성에 대한기능]
	public void showCarInfo() {
		System.out.println("maker : " + this.maker);
		System.out.println("model : " + this.model);
		System.out.println("cc : " + this.cc);
		System.out.println("color : " + this.color);
		System.out.println("price : " + this.price);
		System.out.println("price : " + this.maxspeed);
		System.out.println("speed : " + this.speed);
		System.out.println();
	}
}
