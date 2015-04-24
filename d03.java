
import java.util.Scanner;

public class d03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int totalsum = 0;

		System.out.print("0부터 100 사이의 숫자를 입력하세요.");
		int number = s.nextInt();

		while(number >= 0 && number <= 100){
			count++;
			totalsum = totalsum + number;
			System.out.print("0부터 100 사이의 숫자를 입력하세요.");
			number = s.nextInt();
		}
		double average = (double)totalsum / (double)count;
		System.out.println("입력하신 "+ count + "개의 숫자들의 총합은" + totalsum + "이고, 평균은 " + average + " 입니다.");
	}
}