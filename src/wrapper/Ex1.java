package wrapper;

//Wrapper 클래스 사용하기
public class Ex1 {
	public static void main(String[] args) {
		//Integer class
		//iNum1은 객체화 되어진 상태를 가르키는 참조변수
		Integer iNum1 = new Integer(100);
		
		//new Integer(100)로 변환.(오토박싱)
		Integer iNum2 = 100;
		
		int num1 = iNum1.intValue();//int값 꺼내기
		
		//객체화 되어있는 100을 컴파일러가 꺼내주기 때문에 intValue를 써주지 않아도 됨
		//이렇게 자동으록 값을 꺼내주는걸 언박싱이라 함.
		int num2 = iNum1; //iNum1.intValue()로 변환. (언박싱)
		System.out.println(num1);
		
		
		//참조형과 기본형간의 연산 가능.
		int num3 = iNum1 + 100; //iNum1.intValue() + num2
		
		
		//Boolean 클래스\
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false;//오토박싱으로 객체 생성
		
		//boolean값 꺼내기
		boolean bool1 = boolean1.booleanValue();
		boolean bool2 = boolean2; //언박싱으로 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		
		
		//Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B'; //오토박싱으로 객체 생성
		
		//char 값 꺼내기
		char char1 = character1.charValue();
		char char2 = character2; //언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		
	}
}
