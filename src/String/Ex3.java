package String;

public class Ex3 {
	public static void main(String[] args) {
		
		//String은 값이 변경되어지면 새로운 객체를 생성하여 주소가 변경되어짐
		String str = "java";
		System.out.println("str 문자열 주소:" + System.identityHashCode(str));
		//str 문자열 주소:925858445
		
		str = str + " and";
		str = str + " android";
		System.out.println("str 문자열 주소:" + System.identityHashCode(str));
		//str 문자열 주소:868693306
		
		
		//StringBuilder클래스는 String 의 단점을 보완
		//내용을 변경해도 객체를 새로 생성하지 않는다.
		//메모리적으로 이점이 있다고 볼 수 있음
		StringBuilder buffer = new StringBuilder("java");
		System.out.println("buffer 문자열 주소:" + System.identityHashCode(buffer));
		//buffer 문자열 주소:1746572565
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(buffer.toString());
		System.out.println("buffer 문자열 주소:" + System.identityHashCode(buffer));
		//buffer 문자열 주소:1746572565
	}
}
