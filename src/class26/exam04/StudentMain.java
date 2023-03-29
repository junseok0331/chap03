package class26.exam04;

public class StudentMain {

	public static void main(String[] args) {

		Student[] arrStd = new Student[5];
		arrStd[0] = new Student("김홍철", 23, '남', "010-2340-1233", 85);
		arrStd[1] = new Student("정순미", 24, '여', "010-9857-7532", 85);
		arrStd[2] = new Student("이만섭", 22, '남', "010-6548-4687", 85);
		arrStd[3] = new Student("최주호", 20, '남', "010-2528-9368", 85);
		arrStd[4] = new Student("고미림", 26, '여', "010-1068-2549", 85);

		String maxName = " ";
		int max = 0;
		int count = 0;
		int sum = 0;
		double avg = 0.0;
		int[] score1 = { 85, 70, 96, 85, 77 };
		String[] name1 = { "김홍철", "정순미", "이만섭", "최주호", "고미림" };
		System.out.println("=================================================");
		System.out.println(" name   age    gender       phone      score       ");
		System.out.println("----------------------------------------------------");
		for (Student std : arrStd) {
			System.out.println(std.showStudentInfo());
			
			
		}
		for (int i = 0; i < arrStd.length; i++) {
			System.out.println(arrStd[i].name + "\t" + arrStd[i].age + "\t" + arrStd[i].gender + "\t" + arrStd[i].phone
					+ "\t" + arrStd[i].score);
			count++;
		}
		for (int score : score1) {
			sum = sum + score;
		}
		for (int i = 0; i < score1.length; i++) {
			if (max < score1[i]) {
				max = score1[i];
				maxName = name1[i];
			}
		}
		avg = (double) sum / count;
		System.out.println("------------------------------------------------");
		System.out.printf("총인원 :%d", count, avg);
		System.out.println("");
		avg = (sum * 1.0) / score1.length;
		System.out.printf("평균 점수  : %.2f \n ", avg);
		System.out.println("96점이며 최고점의 학생은 :" + maxName + "님 입니다.");
	}

}
