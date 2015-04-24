import java.util.Scanner;

public class g07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int team_count;
		int charge[] = {5000, 10000, 15000, 3000};
		int count[] = new int[4];
		int v_count[] = new int[4];
		int sum = 0;
		int total_sum = 0;
		int total_count = 0;
		int membership = 0;
		String age[] = {"초등학생", "청소년", "일반인", "경로대상"};

		System.out.print("오늘 방문한 팀 수를 입력하세요.");
		team_count = s.nextInt();

		for(int i = 0; i < team_count; i++){
			System.out.print((i + 1) + "번팀 인원 수(초등학생, 청소년, 일반인, 경로대상)를 입력하세요. ");
			for(int j = 0; j < 4; j++){
				count[j] = s.nextInt();
				v_count[j] = v_count[j] + count[j];
				sum = sum + (count[j] * charge[j]);
				total_count = total_count + count[j];
			}

			System.out.print((i + 1) + "번팀 할인카드 종류 (카드없음 : 0, 알반등급 : 1, VIP : 2)를 입력하세요. ");
			membership = s.nextInt();

			if(membership == 2){
				sum = (sum / 100) * 80;
			}
			else if (membership == 1) {
				sum = (sum / 100) * 90;	
			}

			total_sum = total_sum + sum;

			System.out.println((i + 1) + "번팀 입장료는 " + sum + "원 입니다.");
			sum = 0;
		}
		System.out.println("");
		System.out.println("오늘 총 방문자 수는 " + total_count + "명 입니다.");
		
		for(int i = 0; i < 4; i++){
			System.out.println(age[i] + " 수는 " + v_count[i] + "명 입니다.");
		}
		System.out.println("");
		System.out.println("총 입장료는 " + total_sum + "원 입니다.");
	}
}