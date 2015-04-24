import java.util.Scanner;

public class a05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("날 수를 입력 해주세요");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("날 수에 해당하는 시간은 " + seconds + " 초 입니다.");
	}
}