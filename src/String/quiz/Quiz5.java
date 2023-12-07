package String.quiz;

//입력받은 문자열 거꾸로 출력하기

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reverseStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reverseStr += str.charAt(i); 
		}
		System.out.println(reverseStr);
		
		
		//StringBuilder클래스에서 제공하는 reverse()메소드를 이용할 수 있음
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder);	
		
	}
}
