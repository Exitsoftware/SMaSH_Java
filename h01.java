import java.util.Scanner;
import java.util.Random;

public class h01{
	public static void main(String[] args) {
		Random rand_generator = new Random();
		Scanner s = new Scanner(System.in);
		int answer = rand_generator.nextInt(100);
		int input_num;
		int count = 0;
		while(true){
			System.out.println("1부터 100까지의 숫자 하나를 맞춰보세요");
			input_num = s.nextInt();
			if (input_num > answer){
				System.out.println("좀 더 작은 숫자입니다.");
				count++;
			}
			else if (input_num < answer){
				System.out.println("좀 더 큰 숫자입니다.");
				count++;
			}
			else if (input_num == answer) {
				count++;
				System.out.println(count + " 번 만에 맞추셨습니다.");
				break;
			}
		}
	}
}