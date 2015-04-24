

import java.util.Scanner;

public class b07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("파일 용량을 메가바이트 단위로 입력하세요.");
		int megabytes = s.nextInt();
		long bytes = megabytes * 1024 * 1024;
		System.out.println("USB 포트가 2.0이면 Y 아니면, N을 입력하세요.");
		String usb2 = s.next();

		if (usb2.equals("Y")){
			long time = bytes / 60000000;
			System.out.println("파일 전송 시간은 " + time + " 초 입니다.");
		}
		else if (usb2.equals("N")){
			long time = bytes / 1500000;
			System.out.println("파일 전송 시간은 " + time + " 초 입니다.");
		}
		else{
			System.out.println("잘못입력하셨습니다.");
		}
	}
}