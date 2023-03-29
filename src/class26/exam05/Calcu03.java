package class26.exam05;

/**
 * 외부에서 excute()메소드가 호출되고 execute()에서 내부 연산 메소드 호출함
 */
public class Calcu03 {
	
	//덧셈()정수
	public int sum(int x, int y) {   // 곱셈:mult *  나눗셈:div /  
		return x + y;
	}
	//덧셈()실수
	public double sum(double x, double y) {
		return x + y;
	}
	
	//정수 평균 구하는 메소드
	public double avg(int x, int y) {
		int sum = 0;
		double avg = 0.0;
		////sum메소드 호출
		 sum = sum(x, y);
		avg = (double)sum /2;
		return avg;
	}
	
	//실수 평균 구하는 메소드
	public double avg(double x, double y) {
		double sum = 0.0;
		double avg = 0.0;
		////sum메소드 호출
		sum = sum(x,y);
		avg =(double)sum / 2;
		return avg;
	}
	
	//정수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void execute(int x, int y) {
		double avg = 0.0;
		avg = avg(x, y);
		System.out.println(x + " + " + y + " 평균은 " + avg);		
	}
	
	//실수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void execute(double x, double y) {
		double avg = 0.0;
		avg = avg(x , y);
		System.out.println(x + " + " + y + " 평균은 " + avg);		
	}
	

}
