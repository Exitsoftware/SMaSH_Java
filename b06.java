
import java.util.Scanner;

public class b06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = s.nextInt();

		int total = kor + eng + math;

		double average = total / 3.0;

		System.out.println("입력하신 점수의 총점은 " + total + " 점 이고,");
		System.out.println("평균은 " + average + " 점 입니다.");

		if(kor >= 90){
			System.out.println("국어가 우수합니다.");

			if(eng >= 90){
				System.out.println("영어가 우수합니다.");
				
				 if(math >= 90){
					System.out.println("수학이 우수합니다.");
				}
			}
		}
		
	}
}