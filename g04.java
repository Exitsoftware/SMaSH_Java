import java.util.Scanner;

public class g04{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int kind;
		int money;
		int charge = 0;
		int total_charge = 0;

		while(true){
			System.out.print("부동산 거래종류 (1 : 매매, 2 : 임대, 0 : 계산종료)를 입력하세요. : ");
			kind = s.nextInt();

			if(kind == 0){
				System.out.println("");
				System.out.println("지금까지 중개 수수료 총액은 " + total_charge + "원 입니다.");
				break;
				
			}

			System.out.print("부동산 거래금액(원)을 입력하세요. : ");
			money = s.nextInt();

			if(kind == 1){
				if(money >= 200000000){
					charge = (money / 1000) * 4;
					total_charge = total_charge + charge;
				}
				else if (money >= 50000000 && money < 200000000) {
					charge = (money / 1000) * 5;	
					
					if(charge >= 800000){
						charge = 800000;
					}
					
					total_charge = total_charge + charge;	
				}
				else {
					charge = (money / 1000) * 6;	

					if(charge >= 250000){
						charge = 250000;
					}

					total_charge = total_charge + charge;
				}
			}

			else if (kind == 2) {
				if(money >= 100000000){
					charge = (money / 1000) * 3;
					total_charge = total_charge + charge;
				}
				else if (money >= 50000000 && money < 100000000) {
					charge = (money / 1000) * 4;	

					if(charge >= 300000){
						charge = 300000;
					}

					total_charge = total_charge + charge;
				}
				else if (money >= 20000000 && money < 50000000) {
					charge = (money / 1000) * 5;	
					
					if(charge >= 200000){
						charge = 200000;
					}
				
					total_charge = total_charge + charge;
				}
				else {
					charge = (money / 100) * 5;		

					if(charge >= 70000){
						charge = 70000;
					}
				
					total_charge = total_charge + charge;
				}
			}

				System.out.println("");
				System.out.println("이에 대한 중개 수수료는 " + charge + "원 입니다.");				
				System.out.println("");
			

		}
	}
}