import java.util.Scanner;

public class e02{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("직각삼각형의 높이와 왼쪽여백 크기를 입력하세요.");
		int height = s.nextInt();
		int blank = s.nextInt();

		for(int i = 0; i < height; i++){
			for(int j = (blank + height - 1); j >= 0 ; j--){

				if(i < j){
					System.out.print(" ");	
				}
				else {
					System.out.print("#");
				}
				
			}
			System.out.println("");
		}
	}
}