
import java.util.Scanner;

public class c06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = s.nextInt();

		int total = kor + eng + math;
		double average = total / 3;

		System.out.println("입력하신 점수의 총점은 " + total + " 점 이고,");
		System.out.println("평균은 " + average + " 점 입니다.");


		if(average >= 90){
			System.out.println("수 입니다.");
		}
		else if(average >= 80 && average < 90) {
			System.out.println("우 입니다.");
		}
		else if (average >= 70 && average < 80) {
			System.out.println("미 입니다.");
		}
		else if (average >= 60 && average < 70) {
			System.out.println("양 입니다.");
		}else {
			System.out.println("가 입니다.");
		}

	}
}