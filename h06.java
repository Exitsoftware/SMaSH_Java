import java.util.*;

public class h06{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();

		int number[] = new int[5];
		int max, max_a, max_b;
		int min, min_a, min_b;

		System.out.print("2에서 9까지의 숫자 5개를 입력해 주세요. ");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			number[i] = s.nextInt();
		}

		Arrays.sort(number);
		max = Math.max((int)Math.pow(number[number.length-1],number[number.length-2]),(int)Math.pow(number[number.length-2],number[number.length-1]));

		if (max == (int)Math.pow(number[number.length-1],number[number.length-2])){
			max_a = number[number.length-1];
			max_b = number[number.length-2];
		}
		else{
			max_a = number[number.length-2];
			max_b = number[number.length-1];
		}
		min = Math.min((int)Math.pow(number[0],number[1]),(int)Math.pow(number[1],number[0]));
		if (min == (int)Math.pow(number[0],number[1])){
			min_a = number[0];
			min_b = number[1];
		}
		else{
			min_a = number[1];
			min_b = number[0];

		}
		
		System.out.println("가장 큰 수 는 "+max_a+"의" + max_b + "승은 " + max + " 입니다.");
		System.out.println("가장 작은 수 는 "+min_a+"의" + min_b + "승은 " + min + " 입니다.");

	}
}