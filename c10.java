// 숫자 2개와 하나의 연산기호문자('+', '-', '*', '/' 중 1개)를 입력받은 후, 첫 번째 숫자와 두 번째 숫자 사
// 이에 연산기호를 넣은 계산식의 결과 값을 계산하여 출력하라. 변수는 다음과 같이 사용하라.
// int num1, num2; /첫 번째 숫자, 두 번째 숫자
// String operator; / 연산기호문자('+', '-', '*', '/' 중 1개)
// int result; / 연산 결과

import java.util.Scanner;

public class c10{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int result = 0;

		System.out.println("숫자 1을 입력하세요.");
		int num1 = s.nextInt();
		System.out.println("숫자 2를 입력하세요.");
		int num2 = s.nextInt();
		System.out.println("연산기호 문자 '+' , '-' , '*', '/' 중 1개를 입력하세요");
		String operator = s.next();

		if(operator.equals("+")){
			result = num1 + num2;
		}
		else if (operator.equals("-")) {
			result = num1 - num2;
		}
		else if (operator.equals("*")) {
			result = num1 * num2;
		}
		else if (operator.equals("/")) {
			result = num1 / num2;
		}
		else{
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println("계산식의 결과 값은 " + result + " 입니다.");
	}
}