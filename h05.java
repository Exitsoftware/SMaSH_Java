import java.util.Scanner;
import java.util.Random;

public class h05{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("사용하실 코인을 입력하세요.");
		int coin = s.nextInt();
		int number[] = new int[3];
		int count = 0;	
		for (int i = 0; i < coin; i++ ) {
			count = 0;
			System.out.printf("%d번째 게임 Start!!\n", i+1);
			for(int j = 0; j < 3; j++){
				number[j] = rand.nextInt(9)+1;
			}
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < j; k++){
					if (number[j] == number[k]){
						count++;
					}
				}
			}
			// System.out.println(count);
			System.out.printf("게임 결과는 %d %d %d 입니다.\t",number[0],number[1],number[2]);
			if (count == 1){
				System.out.printf("숫자 %d개 일치! 코인 %d개 증정!\n\n",2,2);
				coin += 2;
			}
			else if (count == 3) {
				System.out.printf("숫자 %d개 일치! 코인 %d개 증정!\n\n",3,4);
				coin += 4;
			}
			else if (count == 0){
				System.out.println("꽝 입니다!\n");
			}
		}
	}
}