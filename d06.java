import java.util.Scanner;

public class d06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for(int i = 0; i < 10; i++){

			System.out.println("아파트의 분양면적(제곱미터)를 입력하세요.");
			double m2_area = s.nextInt();
			double pyung_area = m2_area / 3.305;
			System.out.println("아파트의 평형은 " + pyung_area + " 입니다.");

			if(pyung_area >= 50){
				count1++;
			}
			else if (pyung_area >= 30 && pyung_area < 50) {
				count2++;
			}
			else if (pyung_area >= 15 && pyung_area < 30) {
				count3++;
			}
			else{
				count4++;
			}

			System.out.println("소형 아파트의 개수는 " + count4 + " 개 입니다.");
			System.out.println("중소형 아파트의 개수는 " + count3 + " 개 입니다.");
			System.out.println("중형 아파트의 개수는 " + count2 + " 개 입니다.");
			System.out.println("대형 아파트의 개수는 " + count1 + " 개 입니다.");
		}

	}
}