import java.util.Scanner;

public class a02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("섭씨 온도를 입력해주세요");
		double c_degree = s.nextInt();
		double f_degree = c_degree * 1.8 + 32;
		System.out.println("화씨 온도는 " + f_degree + " 도 입니다.");
	}
}