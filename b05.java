// [B05] 날짜 계산
// 날 수를 입력받아 이 날 수에 해당되는 기간은 모두 몇 초인지 계산하고, 100만 초가 넘는 경우에는 100만 
// 초가 모두 몇 번이나 포함되는지 계산하여 출력하라. 단, 초 = 날 수 * 24 * 60 * 60 으로 계산한다. 변수는 다음과 같이 사용하라.
// int days; / 날 수
// int seconds; / 초 단위 시간
// int m_count; / 100만 초 포함 횟수

import java.util.Scanner;

public class b05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("날 수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("날 수에 해당하든 시간은 " + seconds + "  이고");

		if(seconds > 10000000){
			int m_count = seconds / 1000000;
			System.out.println("100만초가 " + m_count + " 번 이나 포함됩니다.");
		}
	}
}