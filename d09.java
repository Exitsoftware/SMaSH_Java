import java.util.Scanner;

public class d09{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	while(true){
		System.out.println("출력하고 싶은 구구단의 단 수를 입력하세요. (2 - 9)");
		int dan = s.nextInt();

		if(dan >= 2 && dan <= 9){
			for(int i = 1; i < 10; i++ ){
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
			break;
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	}
}
