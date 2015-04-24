import java.util.Scanner;

public class g03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int jumsu[][] = new int[5][3];
		int class_sum[] = {0, 0, 0};
		int std_sum[] = {0, 0, 0, 0, 0};
		Double average = 0.0;
		String grade;

		String class_name[] = {"국어","영어","수학"};

		for(int i = 0; i < 5; i++){
			System.out.print((i + 1) + "번 학생의 국어, 영어, 수학 점수를 입력하세요. ");
			for(int j = 0; j < 3; j++){
				jumsu[i][j] = s.nextInt();
				class_sum[j] = class_sum[j] + jumsu[i][j];
				std_sum[i] = std_sum[i] + jumsu[i][j];
			}
		}

		System.out.println("");
		System.out.println("1) 각 과목별 총점과 평균 점수");
		
		for(int i = 0; i < 3; i++){
			average = (class_sum[i] / 5.0);
			System.out.println(class_name[i] + "과목 총점은 " + class_sum[i] + " 이고, 평균은 " + average + " 입니다.");
		}

		System.out.println("");
		System.out.println("2) 각 학생별 총점과 평균 점수");

		for(int i = 0; i < 5; i++){
			average = (std_sum[i] / 3.0);
			if(average >= 90){
				grade = "A";
			}
			else if (average >= 80 && average < 90) {
				grade = "B";
			}
			else if (average >= 70 && average < 80) {
				grade = "C";
			}
			else if (average >= 60 && average < 70) {
				grade = "D";
			}
			else {
				grade = "F";
			}

			System.out.println((i + 1) + "번 학생 점수 : 총점 " + std_sum[i] + ", 평균 " + average + ", 등급 " + grade);
		}
	}
}