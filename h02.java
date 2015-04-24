import java.util.Scanner;
import java.util.Random;

public class h02{
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);

		int lotto[] = new int[6];
		int count;
		String one_more;
		while(true){
			System.out.print("생성된 로또 번호는");
			for (int i = 0; i < 6; i++) {
				lotto[i] = rand.nextInt(45)+1;
				for (int j = 0; j < i; j++){
					while (lotto[i] == lotto[j]){
						lotto[i] = rand.nextInt(45)+1;
					}
				}
				System.out.print(" "+lotto[i]+" ");
			}
			System.out.println("입니다.");
			System.out.print("더 만드시겠습니까? (Y/N)");
			one_more = s.next();
			while (!one_more.equalsIgnoreCase("N") && !one_more.equalsIgnoreCase("Y")){
				System.out.println("잘못된 값이 입력되었습니다. \n");
				System.out.print("더 만드시겠습니까? (Y/N)");
				one_more = s.next();
			}
			if (one_more.equalsIgnoreCase("n")){
				break;
			}

		}
		
	}
}