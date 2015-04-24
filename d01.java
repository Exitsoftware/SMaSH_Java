
import java.util.Scanner;

public class d01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int number = s.nextInt();

		int totalsum = 0;

		for (int i = 0; i < number; i++){
			totalsum = totalsum + (i + 1);
		}

		System.out.println("1부터 입력한 숫자까지 모든 정수들의 합은 " + totalsum + " 입니다.");
	}
}