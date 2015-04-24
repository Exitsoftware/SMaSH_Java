import java.util.Scanner;

public class f03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int jumsu[][] = new int[5][3];
		int kor = 0, eng = 0, math = 0;
		double average[] = new double[3];
		
		for(int i = 0; i < 5; i++){
			System.out.print((i + 1) + " 번째 학생의 국어, 영어, 수학 점수를 입력하세요.");
			jumsu[i][0] = s.nextInt();
			jumsu[i][1] = s.nextInt();
			jumsu[i][2] = s.nextInt();
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				if(j == 0){
					kor = kor + jumsu[i][j];
				}
				else if (j == 1) {
					eng = eng + jumsu[i][j];
				}
				else {
					math = math + jumsu[i][j];
				}
			}
		}

		average[0] = kor / 5.0;
		average[1] = eng / 5.0;
		average[2] = math / 5.0;

		System.out.println("국어의 총점은 " + kor + " 점이고, 평균은 " + average[0] + " 점 입니다.");
		System.out.println("영어의 총점은 " + eng + " 점이고, 평균은 " + average[1] + " 점 입니다.");
		System.out.println("수학의 총점은 " + math + " 점이고, 평균은 " + average[2] + " 점 입니다.");

	}
}