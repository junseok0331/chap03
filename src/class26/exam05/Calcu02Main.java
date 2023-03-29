package class26.exam05;

public class Calcu02Main {
	public static void main(String[] args) {
		
		//계산기 객체 생성
		Calcu02 ca = new Calcu02();
		//오버로딩 메소드 호출
		int sum1 = ca.add(3,4);
		long sum2 = ca.add(3,41);
		long sum3 = ca.add(31,4);
		long sum4 = ca.add(31,41);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
		//배열 덧셈
		int[] arr = {100, 200, 300};  // 참조 자료형
		int sum5 = ca.add(arr);
		System.out.println("mm.add(a) 결과 : " + sum5);
		
	}

}



