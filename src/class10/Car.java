package class10;

/**
 * this() : 다른 생성자를 호출할 떄 사용함.
 */
public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;

	Car(String model) {
		// 다른 생성자 호출
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		// 다른 생성자 호출
		this(model, color, 250);

	}

	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;

	}
}
