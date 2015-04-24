import java.util.Scanner;
import java.util.Random;

public class h04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		int computer;
		int user;
		int score[][] = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][j] = 0;
			}
		}

		while(true){
			System.out.println("가위(1), 바위(2), 보(3) 를 입력하세요.");
			user = s.nextInt();
			while(user < 0 || user > 3){
				System.out.println("잘못입력하셨습니다.");
				user = s.nextInt();
			}
			if (user == 0) {
					break;
			}
			computer = rand.nextInt(3)+1;
			if (computer == 1){
				
				System.out.println("컴퓨터가 낸 것은 가위 입니다.");

				if(computer == user){
					System.out.println("비겼습니다.");
					score[0][1]++;
					score[1][1]++;
				}
				else if (user == 2) {
					System.out.println("이겼습니다.");
					score[0][2]++;
					score[1][0]++;
				}
				else if(user == 3){
					System.out.println("졌습니다.");
					score[0][0]++;
					score[1][2]++;
				}
			}
			else if (computer == 2) {

				System.out.println("컴퓨터가 낸 것은 주먹 입나다.");
				if(computer == user){
					System.out.println("비겼습니다.");
					score[0][1]++;
					score[1][1]++;
				}
				else if (user == 3) {
					System.out.println("이겼습니다.");
					score[0][2]++;
					score[1][0]++;
				}
				else if (user == 1){
					System.out.println("졌습니다.");
					score[0][0]++;
					score[1][2]++;
				}
			}
			else if (computer == 3){

				System.out.println("컴퓨터가 낸 것은 보 입니다.");
				if(computer == user){
					System.out.println("비겼습니다.");
					score[0][1]++;
					score[1][1]++;
				}
				else if (user == 1) {
					System.out.println("이겼습니다.");
					score[0][2]++;
					score[1][0]++;
				}
				else if (user == 2){
					System.out.println("졌습니다.");
					score[0][0]++;
					score[1][2]++;
				}
			}

		}
		System.out.printf("컴퓨터 : 이긴횟수 %d회, 진 횟수 %d회, 비긴 횟수 %d회\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("유저 : 이긴횟수 %d회, 진 횟수 %d회, 비긴 횟수 %d회\n",score[1][0],score[1][2],score[1][1]);
	}
}