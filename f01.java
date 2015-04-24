import java.util.Scanner;

public class f01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[] = new int[10];
		int first = 0;
		int second = 0;
		int second_max_index = 0;



		for(int i = 0; i < 10; i++){
			System.out.print((i + 1) + " 번째 수를 입력하세요.");
			num[i] = s.nextInt();
		}

		for(int i = 0; i < 10; i++){
			if(first < num[i]){
				first = num[i];
			}
		}

		for(int i = 0; i < 10; i++){
			if(second < num[i] && first != num[i]){
				second = num[i];
				second_max_index = i + 1;
			}
		}

		System.out.println("두 번째로 큰 수는 " + second_max_index + " 번째 수" + second + " 입니다.");
	}
}