

import java.util.Scanner;

public class c08{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = s.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int num3 = s.nextInt();

		int max_num = 0;
		int min_num = 0;

		if(num1 >= num2 && num1 >= num3){
			max_num = num1;
		}
		else if (num2 >= num1 && num2 >= num3) {
			max_num = num2;
		}
		else if (num3 >= num1 && num3 >= num2) {
			max_num = num3;			
		}

		if(num1 <= num2 && num1 <= num3){
			min_num = num1;
		}
		else if (num2 <= num1 && num2 <= num3) {
			min_num = num2;
		}
		else if (num3 <= num1 && num3 <= num2) {
			min_num = num3;			
		}

		System.out.println("가장 큰 수는 " + max_num + " 이고, 가장 작은 수는 " + min_num + " 입니다.");
	}
}