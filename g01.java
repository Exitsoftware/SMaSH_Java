import java.util.Scanner;

public class g01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int birth_year;
		int person = 0;
		int count_baby = 0; 
		int count_child = 0; 
		int count_youth = 0; 
		int count_young = 0; 
		int count_adult = 0; 
		int count_old = 0;


		while(true){
			System.out.print("몇 명의 데이터를 받을 것인지 입력하세요. (최대 100명) : ");
			person = s.nextInt();
			if(person > 100 || person < 1 ){
				System.out.println("다시 입력하세요.");
				System.out.println("");
			}
			else {
				break;
			}
		}

		int age[] = new int[person];		

		for(int i = 0; i < person; i++){
			System.out.print((i + 1) + " 번째 사람의 태어난 연도를 입력하세요.");
			birth_year = s.nextInt();
			age[i] = 2014 - birth_year + 1;
		}

		System.out.println("");

		for(int i = 0; i < person; i++){
			System.out.println((i + 1) + " 번째 사람의 나이는 " + age[i] + " 살 입니다.");

			if(age[i] >= 60){
				count_old++;
			}
			else if (age[i] >= 30 && age[i] < 60) {
				count_adult++;
			}
			else if (age[i] >= 20 && age[i] < 30) {
				count_youth++;
			}
			else if (age[i] >= 13 && age[i] < 20) {
				count_young++;
			}
			else if (age[i] >= 7 && age[i] < 13) {
				count_child++;
			}
			else{
				count_baby++;
			}
		}

		System.out.println("");
		System.out.println("유아는 " + count_baby + " 명 입니다.");
		System.out.println("어린이는 " + count_child + " 명 입니다.");
		System.out.println("청소년은 " + count_young + " 명 입니다.");
		System.out.println("청년은" + count_youth + " 명 입니다.");
		System.out.println("중년은" + count_adult + " 명 입니다.");
		System.out.println("노년은" + count_old + " 명 입니다.");
	}
}