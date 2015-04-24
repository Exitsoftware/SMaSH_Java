import java.util.Scanner;

public class f06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number[][] = new int[5][3];
		int total = 0;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				System.out.print((i + 1) + "0" + (j + 1) + "호에 살고있는 사람의 숫자를 입력하세요.");
				number[i][j] = s.nextInt();
			}
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				total = total + number[i][j];
			}
		}

		System.out.println("이 아파트에 살고 있는 거주자는 총 " + total + " 명 입니다.");
	}
}