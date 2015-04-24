
import java.util.Scanner;

public class c05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int day_count = 0;

		System.out.print("월을 입력하세요. ");
		int month = s.nextInt();
		System.out.print("일을 입력하세요. ");
		int day = s.nextInt();

		if(month > 12 || month < 1){
			System.out.println("잘못입력하셨습니다.");
		}
		else {

			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
				if(day > 31 || day < 1){
						System.out.println("잘못입력하셨습니다.");
						System.exit(0);
				} 
			}
			else if (month == 2) {
				if(day > 28 || day < 1){
					System.out.println("잘못입력하셨습니다.");
					System.exit(0);
				} 
			}
			else{
				if(day > 30 || day < 1){
					System.out.println("잘못입력하셨습니다.");
					System.exit(0);
				}
			}

			for(int i = 1; i < month; i++){
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
						day_count = day_count + 31;

				}
				else if (i == 2) {
						day_count = day_count + 28;
				}

				else {
						day_count = day_count + 30;
				}
			}
			day_count = day_count + day;
			System.out.println("이 날짜는 1년 중 " + day_count + " 번째 날에 해당됩니다.");
		}
	}
}