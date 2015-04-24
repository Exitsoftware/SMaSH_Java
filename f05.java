import java.util.Scanner;

public class f05{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double height, weight, bmi;
		Double bmilist[][] = new Double[10][3];
		int count = 0;

		for(int i = 0; i < 10; i++){
			System.out.print((i + 1) + "번째 신장(cm)과 체중(kg)을 입력하세요.");
			height = s.nextDouble() / 100;
			weight = s.nextDouble();
			bmi = weight / (height * height);

			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = bmi;
		}

		for(int i = 0; i < 10; i++){
			if(bmilist[i][2] >= 25){
				System.out.println((i + 1) + " 번째 사람은 비만입니다.");
				count++;
			}
		}
		System.out.println("");
		System.out.println("총 비만인 사람은 " + count + " 명 입니다.");
	}
}