package String.quiz;

//공백을 제거한 후 글자수 세기


public class Quiz4 {
	public static void main(String[] args) {
		getCharCount("자바 프로그래밍 입문");
		getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
		
		
		//-----------------------------------------------
		//split 메소드 이용
		int sum = 0;
		String str = "자바 프로그래밍 입문";
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			sum += strArr[i].length();
		}
		System.out.println(sum);
		
		
		//------------------------------------------------
		//charAt()을 이용
		String str1 = "자바 프로그래밍 입문";
		int len = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(str.charAt(i) != ' ') {
				len++;
			}
		}
		System.out.println(len);//공백 제거후 글자 수
		System.out.println(str1.length());//공백 포함 글자 수
		
	}
	
	
	
	public static void getCharCount(String str) {
		
		int len = str.replace(" ","").length();
		
		System.out.println(len);
	}
	
	
}
