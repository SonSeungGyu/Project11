package String.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if(str.charAt(7)=='1' || str.charAt(7)=='3') {
			System.out.println("성별은 남자입니다.");
		}else{
			System.out.println("성별은 여자입니다.");
		}
		
		
		//선생님 풀이
		String pin = "881110-1234571";
		char gender = pin.charAt(7);
		
		if(gender =='1' || gender =='3') {
			System.out.println("성별은 남자입니다");
		}else {
			System.out.println("성별은 여자입니다");
		}
	}
}
