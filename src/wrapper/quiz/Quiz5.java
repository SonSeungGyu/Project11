package wrapper.quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하쇼");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("값을 입력하쇼");
		int num2 = Integer.parseInt(sc.nextLine());
		int sum = num1 + num2;
		System.out.println("두수의 합: " + sum);
		
	}
}

