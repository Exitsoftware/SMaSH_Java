
import java.util.Scanner;

public class b02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("온도를 입력하세요");
		double input_degre = s.nextInt();
		System.out.println("입력한 온도가 섭씨면 C, 화씨면 F를 입력하세요.");
		String kind = s.next();
		if(kind.equals("C")){
			double output_degree = input_degre * 1.8 + 32;
			System.out.println("변환된 온도는 " + output_degree + " 도 입니다.");
		}
		else if(kind.equals("F")){
			double output_degree = (input_degre - 32)/1.8;
			System.out.println("변환된 온도는 " + output_degree + " 도 입니다.");
		}
		else{
			System.out.println("잘못입력하셨습니다.");
		}

	}
}