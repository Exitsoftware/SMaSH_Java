

import java.util.Scanner;

public class c07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double time = 0;

		System.out.println("파일 용량을 메가바이트 단위로 입력하세요.");
		int megabytes = s.nextInt();

		long bytes = megabytes * 1024 * 1024;
		System.out.println("전송방식을 1. Wi-Fi, 2. Bluetooth, 3. LTE, 4. USB 에서 선택하여 입력하세요");

		int kind = s.nextInt();
		if(kind >= 1 && kind <= 4){
			switch (kind) {
				case 1: {
					time = bytes / 1500000;
					break;
				}
				case 2: {
					time = bytes / 300000;
					break;
				}
				case 3: {
					time = bytes / 1000000;
				}
				case 4: {
					time = bytes / 60000000;
				}
			}
			System.out.println("파일 전송 시간은 " + time + " 초 입니다.");
		}
		else{
			System.out.println("잘못입력하셨습니다.");
		}
	}
}