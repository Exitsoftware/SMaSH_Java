import java.util.Scanner;

public class f02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double total = 0;
		double average = 0;
		double score[] = new double[10];

		for(int i = 0; i < 10; i++){
			System.out.print((i + 1) + " 번 심사점수를 입력하세요.");
			score[i] = s.nextDouble();
		}

		double maxscore = score[0];
		double minscore = score[0];

		for(int i = 0; i < 10; i++){
			if(maxscore < score[i]){
				maxscore = score[i];
			}
			else if (minscore > score[i]) {
				minscore = score[i];
			}
		}


		for(int i = 0; i < 10; i++){
			if(score[i] != minscore && score[i] != maxscore){
				total = total + score[i];
			}
		}

		System.out.println(maxscore+" "+minscore);
		System.out.println(total);
		average = total / 8;
		System.out.println("가장 큰 점수와 가장 적은 점수를 제외한 8개 점수에 대한 평균은 " + average + " 입니다.");
	}
}