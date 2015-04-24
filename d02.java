// 반복해서 0부터 100 사이의 숫자를 입력받아서 지금까지 입력된 숫자들 중 가장 큰 수와 가장 작은 수가 무엇인지 출력하라.
// 0부터 100 사이의 숫자가 아닌 수가 입력되면 반복문이 중단되도록 하라.
// 반복은 while 구문을 사용하고, 변수는 다음과 같이 사용하라.
// int number; // 입력받은 수
// int max_num, min_num; // 가장 큰 숫자, 가장 작은 숫자

import java.util.Scanner;

public class d02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number = 0;
		
			System.out.print("0부터 100까지의 수를 입력하세요.");
			number = s.nextInt();
			int min_num = number;
			int max_num = number;

		while(number >= 0 && number <= 100){
			
			if (number >= max_num){
				max_num = number;
			}
			
			if (number <= min_num) {
				min_num = number;
			}

			System.out.print("0부터 100까지의 수를 입력하세요.");
			number = s.nextInt();

		}
		System.out.println("입력된 숫자중 가장 큰 숫자는 " + max_num + " 이고, 가장 작은 숫자는 " + min_num + " 입니다.");
	}
}