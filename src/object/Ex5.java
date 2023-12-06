package object;

public class Ex5 {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1.toString());//문자열 값 출력
		System.out.println(str1);
		
		if(str1.equals(str2)) {//내용만을 비교
			System.out.println("같은 문자열입니다.");
		}else {
			System.out.println("다른 문자열입니다.");
		}
		
		if(str1 == str2) { //주소를 비교
			System.out.println("같은 주소입니다.");
		}else {
			System.out.println("다른 주소입니다.");
		}
		
		//String 타입의 리터럴값으로 변수를 선언하게 될 때 
		//String pool이 존재하여 같은 주소를 참조하게됨.
		if(str3 == str4) { //주소를 비교하나 같은 String pool을 참조
			System.out.println("같은 주소입니다.");
		}else {
			System.out.println("다른 주소입니다.");
		}
		
	}
}
