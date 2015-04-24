import java.util.Scanner;

public class a01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("태어난 연도를 입력해 주세요");
		int birth_year = s.nextInt();
		int age = 2014 - birth_year + 1;
		System.out.println("당신의 나이는 " + age + " 살 입니다.");
	}
}