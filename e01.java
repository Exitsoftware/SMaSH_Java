import java.util.Scanner;

public class e01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정사각형의 크기를 입력하세요.");
		int length = s.nextInt();


		for(int i = 1; i < (length * length + 1); i++){
			System.out.print("#");
			if(i % length == 0){
				System.out.println("");
			}
		}
	}
}