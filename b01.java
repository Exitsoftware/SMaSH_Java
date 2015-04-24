import java.util.Scanner;

public class b01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("태어난 연도를 입력해주세요");
		int birth_year = s.nextInt();
		int age = 2014 - birth_year + 1;
		System.out.println(age);
		if(age < 20){
			System.out.println("미성년자 입니다.");
		}
		else{
			System.out.println("미성년자가 아닙니다.");
		}
	}
}