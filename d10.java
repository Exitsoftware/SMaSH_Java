import java.util.Scanner;

public class d10{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("두 개의 숫자를 입력하세요. : ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.print(num1 + ", " + num2);

		for(int i = num2 + 1; i <= 100; i++){

				if(i % num1 == 0 && i % num2 != 0){
					System.out.print(", " + i);
				}
				if(i % num2 == 0 && i % num1 != 0){
					System.out.print(", " + i);
				
				}				
		
		}

		System.out.println("");
	}
}