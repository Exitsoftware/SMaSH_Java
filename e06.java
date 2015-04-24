import java.util.Scanner;

public class e06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = 0;
		int blank_count = 0;
		int blank_count2 = 0;


		System.out.print("출력하려는 행과 열의 크기를 입력하세요.");
		int rows = s.nextInt();
		int columns = s.nextInt();
		int temp = rows * columns;

		while(temp > 0){
			temp = temp / 10;
			blank_count++;
		}

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				number = (i + 1) * (j + 1);

				while(number > 0){
					number = number / 10;
					blank_count2++;
				}

				number = (i + 1) * (j + 1);

				for(int k = 0; k < (blank_count - blank_count2 + 2); k++){
					System.out.print(" ");
				}

				System.out.print(number);

				blank_count2 = 0;
			}
			
			System.out.println("");
		}
	}
}