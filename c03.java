// 직사각형의 가로크기와 세로크기를 입력받아 이 값을 이용하여 직사각형의 모양에 대해 평가하는 내용을 출
// 력하라. 단, 평가 내용은 다음 중 1가지 경우로 결정한다. 가로 크기와 세로크기가 동일 : "정사각형입니다."
// 가로 크기가 세로크기의 2배 이상 : "좌우로 길쭉한 직사각형입니다."
// 세로 크기가 가로크기의 2배 이상 : "위아래로 길쭉한 직사각형입니다."
// 가로 크기가 세로크기보다 크면 : "일반적인 가로형 직사각형입니다" 세로 크기가 가로크기보다 크면 : "일반적인 세로형 직사각형입니다" 변수는 다음과 같이 사용하라.
// int width, height; / 가로크기, 세로크기

import java.util.Scanner;

public class c03{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("직사각형의 가로 크기를 입력하세요.");
		int width = s.nextInt();
		System.out.println("직사각형의 세로 크기를 입력하세요.");
		int height = s.nextInt();
		if(width == height){
			System.out.println("정사각형입니다.");
		}
		else if (width >= (height * 2)) {
			System.out.println("좌우로 길쭉한 사각형입니다.");
		}
		else if (height >= (width * 2)) {
			System.out.println("위아래로 길쭉한 사각형입니다.");
		}
		else if (width > height) {
			System.out.println("일반적인 가로형 사각형입니다.");
		}
		else{
			System.out.println("일반적인 세로형 사각형입니다.");
		}
	}
}