import java.util.Scanner;

public class f07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number[][] = new int[5][3];
		int total = 0;
		int floor_total[] = new int[5];
		int line_total[] = new int[3];
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				System.out.print((i + 1) + "0" + (j + 1) + "호에 살고있는 사람의 숫자를 입력하세요.");
				number[i][j] = s.nextInt();
			}
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				floor_total[i] = floor_total[i] + number[i][j];
				line_total[j] = line_total[j] + number[i][j];
				total = total + number[i][j];
			}
		}

		for(int i = 0; i < 5; i++){
			System.out.println((i + 1) + " 층에 사는 사람은 모두 " + floor_total[i] + " 명입니다.");
		}

		System.out.println("");
		
		for(int i = 0; i < 3; i++){
			System.out.println((i + 1) + " 호라인에 사는 사람은 모두 " + line_total[i] + " 명입니다.");
		}

		System.out.println("");
		System.out.println("이 아파트에 살고 있는 거주자는 총 " + total + " 명 입니다.");
	}
}