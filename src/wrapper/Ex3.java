package wrapper;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		
		//리스트는 기초타입을 사용할 수 없기 때문에 
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		//new Boolean(true)로 변환됨.(오토박싱)
		list.add(true);
		list.add(true);
		list.add(false);
		
		//list.get(0).booleanValue()로 변환됨.(언박싱)
		boolean b = list.get(0);
		
	}
}
