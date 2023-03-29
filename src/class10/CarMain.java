package class10;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("자가용");
		System.out.println("Ca1.company : " + car1.company);
		System.out.println("Ca1.model : " + car1.model);
		System.out.println();

		Car car2 = new Car("자가용", "빨강");
		System.out.println("Ca2.company : " + car2.company);
		System.out.println("Ca2.model : " + car2.model);
		System.out.println("Ca2.color: " + car2.color);
		System.out.println();

		Car car3 = new Car("택시", "검정", 200);
		System.out.println("Ca3.company : " + car3.company);
		System.out.println("Ca3.model : " + car3.model);
		System.out.println("Ca3.color : " + car3.color);
		System.out.println("Ca3.maxspeed : " + car3.maxspeed);
	}

}
