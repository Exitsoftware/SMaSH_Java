// 년도를 입력받은 후, 이 년도가 윤년이지 아닌지를 판정하여 그 결과를 출력하라. 윤년의 판정 기준은 다음과 같다.
// 1) 년도가 4로 나누어떨어지는 경우에 윤년이다.
// 2) 위 1)의 기준 중에 100으로 나누어떨어지는 년도는 윤년에서 제외한다.
// 3) 위 2)의 기준 중에 400으로 나누어떨어지는 년도는 윤년이다. 변수는 다음과 같이 사용하라.
// int year; / 입력받은 년도

import java.util.Scanner;

public class c11{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("년도를 입력하세요");
		int year = s.nextInt();

		if((year % 4) == 0 && (year % 400) == 0){
			System.out.println("윤년 입니다.");
		}
		else if ((year % 4) == 0 && (year % 100) == 0) {
			System.out.println("윤년이 아닙니다.");
		}
		else if ((year % 4) == 0) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}