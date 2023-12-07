package String.quiz;

//end나 END가 입력받아져야 프로그램이 종료되도록 만들어보기
import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문장을 입력하세요:");
			String str = scan.nextLine();
			
			if(str.equalsIgnoreCase("end")) {
				break;
			}
			
			if(str.toUpperCase().equals("END")) {
				break;
			}
			
			if(str.equals("end")||str.equals("END")) {
				break;
			}
		}
		
	}
}
