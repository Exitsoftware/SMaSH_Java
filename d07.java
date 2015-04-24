import java.util.Scanner;

public class d07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, b; // 1차 메소드의 계수 a, b
		int x_begin, x_end; // x좌표의 시작 값과 끝 값 int x, y;

		System.out.println("1차 함수 y = ax + b의 계수 a, b를 입력하세요.");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("x좌표의 시작 값과 끝 값을 입력하세요.");
		x_begin = s.nextInt();
		x_end = s.nextInt();

		for(int i = x_begin; i <= x_end; i++){
			System.out.println("좌표 (" + i + ", " + (a * i + b) + ")");
		}
	}
}