package class26.exam02;

public class ProductMain {
	public static void main(String[] args) {

		Product pt1 = new Product();

		pt1.id = 202103001;
		pt1.name = "냉장고 ";
		pt1.price = 500;
		pt1.quantity = 5;
		pt1.amount = 2500;
		//1. 처음상품 출력
		pt1.showProductInfo();
		System.out.println();

		Product pt2 = new Product();

		pt2.id = 202103001;
		pt2.name = "세탁기";
		pt2.price = 250;
		pt2.quantity = -15;
		pt2.amount = -3750;
		//2. 두번째상품 출력
		pt2.showProductInfo();
		System.out.println();
		
		System.out.println(pt1.getAmount());
		System.out.println(pt2.getAmount());

	}

}
