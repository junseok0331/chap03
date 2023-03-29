package class26.exam07;
/**
 * 실행 클래스
 */
public class TimeMain {
	
	public static void main(String[] args) {
		// Time 객체 생성
		Time t = new Time();
		//t.hour = 24;   private 사용해 막아서 오류 뜸
		t.setHouer(25);
		t.showTime();
	}

}
