import java.util.Scanner;

public class g06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int order[] = new int[3];
		int price[] = {10000, 6000, 3000};
		int sale = 0;
		int total_sale = 0;

		System.out.println("세 종류의 제품이 있습니다.");
		System.out.println("(1. 가죽 장갑 1만원, 2. 털 장갑 6천원, 3. 비닐 장갑 3천원");
		System.out.println("");

		while(true){
			for(int i = 0; i < 3; i++){
				System.out.print((i + 1) + "번 제품은 몇 개 구입하실래요? ");
				order[i] = s.nextInt();
				sale = sale + (order[i] * price[i]);
			}

			if(order[0] == 0 && order[1] == 0 && order[2] == 0){
				System.out.println("");
				System.out.println("지금까지의 총 매출금액은 " + total_sale + "원 입니다.");
				break;
			}
			total_sale = total_sale + sale;

			System.out.println("판매금액은 " + sale + "원 입니다.");
			System.out.println("");

			
			sale = 0;
		}
	}
}