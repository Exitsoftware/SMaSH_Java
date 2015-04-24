import java.util.Scanner;

public class d05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width = 0;
		int height = 0;
		int count1 = 0; // 정사각형
		int count2 = 0;	// 좌우로 길쭉한 직사각형
		int count3 = 0; // 위아래로 길쭉한 직사각형
		int count4 = 0; // 일반적인 가로형 직사각형
		int count5 = 0; // 일반적인 세로형 직사각형

		System.out.print("직사각형의 가로와 세로 크기를 입력하세요.");
		width = s.nextInt();
		height = s.nextInt();

		while(width >= 0 && height >= 0){
			
			if (width == height){
				count1++;
			}
			else if (width > height) {
				if(width >= height * 2){
					count2++;
				}
				else{
					count4++;
				}
			}
			else {
				if(height >= width * 2){
					count3++;
				}
				else {
					count5++;
				}
			}
			
			System.out.print("직사각형의 가로와 세로 크기를 입력하세요.");
			width = s.nextInt();
			height = s.nextInt();

		}

		System.out.println("정사각형의 개수는 " + count1 + " 개 입니다.");
		System.out.println("좌우로 길쭉한 직사각형의 개수는 " + count2 + " 개 입니다.");
		System.out.println("위아래로 길쭉한 직사각형의 개수는 " + count3 + " 개 입니다.");
		System.out.println("일반적인 가로형 직사각형의 개수는 " + count4 + " 개 입니다.");
		System.out.println("일반적인 세로형 직사각형의 개수는 " + count5 + " 개 입니다.");

	}
}