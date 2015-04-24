import java.util.Scanner;

public class e03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("이등변 삼각형의 높이를 입력하세요.");
		int height = s.nextInt();

		for(int i = 0; i < height; i++){
			for(int j = 0; j < 2 * height - 1; j++){

				if(j >= (height - 1) - i && 
					j <= (height - 1) + i ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}
}