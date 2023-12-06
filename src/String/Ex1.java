package String;

public class Ex1 {
	public static void main(String[] args) {
		
		String str1 = "test";
		String str2 = "test"; //이미 만들얻진 문자열을 가리킴
		String str3 = new String("test");
		
		System.out.println(str1==str2);//문자열을 공유하므로 true
		System.out.println(str1==str3);//새로운 문자열을 생성하여 false
	}
}
