import java.util.Scanner;

public class f04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int jumsu[][] = new int[5][3];
		int sum[] = new int[5];
		int kor = 0, eng = 0, math = 0;
		double average[] = new double[5] ;
		


		for(int i = 0; i < 5; i++){
			System.out.print((i + 1) + " 번째 학생의 국어, 영어, 수학 점수를 입력하세요. ");
			jumsu[i][0] = s.nextInt();
			jumsu[i][1] = s.nextInt();
			jumsu[i][2] = s.nextInt();
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				sum[i] = sum[i] + jumsu[i][j];
			}
			average[i] = sum[i] / 3.0;
			System.out.println((i + 1) + "번째 학생의 총점은 " + sum[i] + " 점이고, 평균은 " + average[i] + " 점 입니다.");
		}


	}
}