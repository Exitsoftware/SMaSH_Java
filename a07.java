

import java.util.Scanner;

public class a07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("파일 용량은 기가바이트 단위로 입력하세요");
		int gigabytes = s.nextInt();
		int megabytes = gigabytes * 1024;
		int kilobytes = megabytes * 1024;
		long bytes = kilobytes * 1024;
		System.out.println("입력하신 파일 용량은");
		System.out.println(megabytes + " 메가바이트");
		System.out.println(kilobytes + " 킬로바이트");
		System.out.println(bytes + "바이트 입니다.");
	}
}