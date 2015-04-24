// 신장(cm단위)과 체중(kg단위)를 입력받은 후, 비만 여부를 판정하여 출력하라. 단, 비만여부는 다음 비만도 수치가 25이상인 경우에 "비만"으로 판단한다. 
// 비만도 수치 = 체중(kg) / (신장(m)의 제곱) 으로 계산한다. 이 때, 신장은 미터 단위로 환산해야 함을 유의하라. 변수는 다음과 같이 사용하라.
// int height, weight; / 신장(cm), 체중(kg)
// int bmi; / 비만도 수치

import java.util.Scanner;

public class b09{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("신장(cm단위)를 입력하세요.");
		Double height = s.nextDouble() / 100.0;
		System.out.println("체중(kg단위)를 입력하세요.");
		int weight = s.nextInt();

		Double bmi = weight / (height * height);

		if(bmi >= 25){
			System.out.println("당신은 비만입니다.");
		}
		else{
			System.out.println("당신은 비만이 아닙니다.");
		}
	}
}