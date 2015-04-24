import java.util.*;
import java.lang.*;

public class h07{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("===================================");
			System.out.print("문자열을 입력하세요 (x: 종료) ");
			String text = s.next();
			if(text.equals("x")){
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("총 문자열 개수는 " + text.length() + " 개 입니다.");
			for(int i = 0; i < text.length(); i++){
				System.out.println(text.charAt(i));
			}
			System.out.println("");
		}
	}
}





