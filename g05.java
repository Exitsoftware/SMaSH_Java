import java.util.Scanner;

public class g05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int hour, minute;
		int charge = 0;
		int total_charge = 0;

		while(true){
			System.out.print("이용한 시간을 시간과 분으로 입력하세요.");
			hour = s.nextInt();
			minute = s.nextInt();

			if(hour == 0 && minute == 0){
				System.out.println("");
				System.out.println("지금까지 이용한 총 금액은 " + total_charge + "원 입니다.");
				break;
			}

			minute = minute + (hour * 60);
			charge = ((minute / 30) * 1000) + 1000;
			
			if(minute % 30 == 0){
				charge = charge - 1000;
			}

			if(minute >= 120 && minute < 180){
				charge = (charge / 100) * 95;
			}
			else if (minute >= 180 && minute < 300) {
				charge = (charge / 100) * 90;
			}
			else if (minute >= 300) {
				charge = (charge / 100) * 80;
			}

			total_charge = total_charge + charge;
			System.out.println("고객님의 이용료는 " + charge + "원 입니다.");
			System.out.println("");

		}
	}
}