// 아파트의 분양 면적을 제곱미터(m2) 단위로 입력받아 이 값을 평형 단위의 값으로 변환하라. 그리고 평형 
// 수에 따라 아파트의 종류를 구분하여 그 결과를 출력하라. 단, 평형 수 = 제곱미터 / 3.305 로 계산하고, 크기에 따른 아파트 종류는 다음과 같이 판정한다. 15평 미만 : 소형 
// 15평 이상 ~ 30평 미만 : 중소형
// 30평 이상 ~ 50평 미만 : 중형
// 50평 이상 : 대형
// 변수는 다음과 같이 사용하라. double m2_area; / 면적 (제곱미터)
// double pyung_area; / 면적 (평수)

import java.util.Scanner;

public class c04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("아파트의 분양면적 (제곱미터)를 입력하세요");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area / 3.305;
		if(pyung_area >= 15 && pyung_area < 30){
			System.out.println("중소형입니다.");
		}
		else if (pyung_area >= 30 && pyung_area < 50) {
			System.out.println("중형입니다.");
		}
		else if (pyung_area >= 50) {
			System.out.println("대형입니다.");
		}
		else {
			System.out.println("소형입니다.");
		}
	}
}