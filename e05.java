import java.util.Scanner;

public class e05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("구구단 출력 모드 (1 : 홀수단, 2: 짝수단)을 입력하세요.");
		int mode = s.nextInt();
		System.out.print("한 줄에 표시할 개수를 입력해 주세요.");
		int column = s.nextInt();

		if(mode == 1){
			for(int i = 3; i < 10; i++){
				if(i % 2 == 1){
					for(int j = 1; j < 10; j++){
						System.out.print(i + " X " + j + " = " + (i * j) + "\t");
						if(j % column == 0 && j != 9){
							System.out.println("");	
						}
					}
				}
				System.out.println("");
			}
		}
		else {
			for(int i = 2; i < 10; i++){

				if(i % 2 == 0){
					for(int j = 1; j < 10; j++){
						System.out.print(i + " X " + j + " = " + (i * j) + "\t");
						if(j % column == 0 && j != 9){
							System.out.println("");	
						}
					}
				}
				if(i != 9){
					System.out.println("");
				}
			}
		}
	}
}