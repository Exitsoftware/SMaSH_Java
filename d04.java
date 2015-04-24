import java.util.Scanner;

public class d04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int young_count = 0;

		System.out.println("가족이 몇 명인지 입력해주세요.");
		int count_all = s.nextInt();

		for(int i = 0; i < count_all; i++){
			System.out.println("태어난 연도를 입력하세요.");
			int birth_year = s.nextInt();
			int age = 2014 - birth_year + 1;

			if (age < 20){
				young_count++;
			}
		}

		System.out.println("가족들 중 미성년자는 " + young_count + " 명 입니다.");
	}
}