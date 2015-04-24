
import java.util.Scanner;

public class c01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("태어난 연도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2014 - birth_year + 1;

		if(age >= 60){
			System.out.println("노년입니다.");
		}
		else if(age >= 30 && age < 60){
			System.out.println("중년입니다.");
		}
		else if(age >= 20 && age < 30){
			System.out.println("청년입니다.");
		}
		else if(age >= 13 && age < 20){
			System.out.println("청소년 입니다.");
		}
		else if(age >= 7 && age < 13){
			System.out.println("어린이입니다.");
		}
		else {
			System.out.println("유아입니다.");
		}
	}
}