import java.util.Scanner;

public class a04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("아파트의 분양 면적을 입력하세요");
		double m2_area = s.nextInt();
		double pyung_area =  m2_area / 3.305 ;
		System.out.println("아파트의 평형은 " + pyung_area + " 입니다.");

	}
}