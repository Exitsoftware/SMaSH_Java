

import java.util.Scanner;

public class c09{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("연봉(원 단위)을 숫자로 입력하세요.");
		int income = s.nextInt();
		double tax = 0;

		if(income >= 80000000){
			tax = (income / 100) * 37;
		}
		else if (income >= 40000000 && income < 80000000) {
			tax = (income / 100) * 28;
		}
		else if (income >= 10000000 && income < 40000000) {
			tax = (income / 100) * 19;
		}
		else{
			tax = (income / 100) * 9.5;
		}

		System.out.println("연봉 금액에 대한 소득세는 " + tax + " 원 입니다.");
	}
}