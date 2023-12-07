package wrapper.quiz;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz4 {
	public static void main(String[] args) {
		
		//문자를 저장하는 리스트 생성
		ArrayList<Character> list = new ArrayList<Character>();
		//리스트에 문자 추가
		
		list.add('a');//list.add(new Character('a))로 변환됨 오토박싱
		list.add('b');
		list.add('c');
		list.add('d');
		
		//리스트 안에 저장된 문자를 모두 출력
		for (int i = 0; i < list.size(); i++) {
			char c = list.get(i);//list.get(i).charValue()로 꺼내옴, 꺼내올때 언박싱
			System.out.println(c);
		}
		
		
	}
}
