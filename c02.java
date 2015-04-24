
import java.util.Scanner;

public class c02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("물의 온도를 입력하세요.");
		double input_degre = s.nextDouble();
		if(input_degre >= 0 && input_degre < 25){
			System.out.println("냉수입니다.");
		}
		else if (input_degre >= 25 && input_degre < 40) {
			System.out.println("미온수입니다.");
		}
		else if (input_degre >= 40 && input_degre < 80) {
			System.out.println("온수입니다.");
		}
		else if (input_degre >= 80) {
			System.out.println("끓는 물입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}