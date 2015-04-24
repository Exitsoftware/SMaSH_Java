

import java.util.Scanner;

public class a06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = s.nextInt();
		System.out.println("국어 점수를 입력하세요");
		int math = s.nextInt();
		int total = kor + eng + math;
		double average = total / 3;
		System.out.println("총점은 " + total + " 점 이고,");
		System.out.println("평균은 " + average + " 점 입니다.");

	}
}