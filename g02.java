import java.util.Scanner;

public class g02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double degrees[] = new double[10];
		String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
		int count[] = {0, 0, 0, 0};
		int sel = 0;

		for(int i = 0; i < 10; i++){
			System.out.print((i + 1) + "번 물의 온도를 입력하세요. ");
			degrees[i] = s.nextDouble();

		}

		System.out.println("");

		for(int i = 0; i < 10; i++){
			
			if(degrees[i] >= 80){
				count[3]++;
				sel = 3;
			}
			else if (degrees[i] >= 40 && degrees[i] < 80) {
				count[2]++;
				sel = 2;
			}
			else if (degrees[i] >= 25 && degrees[i] < 40) {
				count[1]++;
				sel = 1;
			}
			else if (degrees[i] >= 0 && degrees[i] < 25) {
				count[0]++;
				sel = 0;
			}
			
			if (degrees[i] < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
			else {
				System.out.println((i + 1) + "번 물의 온도는 " + degrees[i] + "도 입니다. : " + degree_name[sel]);	
			}
			
		}

		System.out.println("");
		
		for(int i = 0; i < 4; i++){
			System.out.println(degree_name[i] + " 입력 횟수 : " + count[i]);
		}

	}
}