import java.util.Scanner;
import java.util.Random;

public class h03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();

		int lotto_com[] = new int[6];
		int lotto_user[] = new int[6];
		int count = 0;

		for (int i = 0; i < 6; i++) {
			lotto_com[i] = rand.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				while (lotto_com[i] == lotto_user[j]){
					lotto_com[i] = rand.nextInt(45)+1;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.print((i+1)+" 번째 값을 입력하세요. : ");
			lotto_user[i] = s.nextInt();	
			while(lotto_user[i] < 1  || lotto_user[i] > 45){
				System.out.println("잘못입력하셨습니다.");
				System.out.print((i+1)+" 번째 값을 입력하세요. : ");
				lotto_user[i] = s.nextInt();
			}

			for (int j = 0; j < i; j++){
				while(lotto_user[i] == lotto_user[j]){
					System.out.println("잘못입력하셨습니다.");
					System.out.print((i+1)+" 번째 값을 입력하세요. : ");
					lotto_user[i] = s.nextInt();
				}	
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++){
				if (lotto_user[i] == lotto_com[j]){
					count++;
					break;
				}
			}
		}

		System.out.print("생성된 로또 번호는");
		for (int i = 0; i < 6; i++) {
			System.out.print(" "+lotto_com[i]+" ");
		}
		System.out.println("입니다.");

		System.out.println("맞추신 로또 번호는 "+count+"개 입니다.");
	}
}