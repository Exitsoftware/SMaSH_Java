import java.util.Scanner;

public class f09{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month, day;
		int day_count = 0;

		System.out.print("월을 입력하세요.");
		month = s.nextInt();

		System.out.print("알을 입력하세요.");
		day = s.nextInt();

		if(month > 12 || month < 1){
			System.out.println("잘못입력하셨습니다.");
			System.exit(0);
		}

		if(day > monthdays[(month - 1)] || day < 1 || month > 12 || month < 1){
			System.out.println("잘못입력하셨습니다.");
			System.exit(0);
		}

		for(int i = 0; i < (month - 1); i++){
			day_count = day_count + monthdays[i];
		}

		day_count = day_count + day;

		System.out.println("이 날짜는 1년 중 " + day_count + " 번째에 해당하는 날 입니다.");
	}
}