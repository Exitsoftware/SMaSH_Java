import java.util.Scanner;

public class f08{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number[] = new int[10];
		int count = 0;
		int newnum;
		boolean dup = true;
		System.out.println("1부터 100까지의 숫자를 입력하세요.");
		
		while(count < 10){
			System.out.print((count + 1) + " 번째 숫자를 입력하세요.");
			newnum = s.nextInt();

			for(int i = 0; i < count; i++){
				if(number[i] == newnum || newnum < 1 || newnum > 100){
					System.out.println("잘못입력하셨습니다.");
					dup = false;
					break;
				}
				else {
					dup = true;
				}
			}

			if(dup == true){
				number[count] = newnum;
				count++;
			}
		}

		for(int i = 0; i < 10; i++){
			System.out.println((i + 1) + " 번째 숫자는" + number[i] + " 입니다.");
		}

	}
}